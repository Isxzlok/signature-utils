package com.niezhiliang.signature.utils.seal.impl;

import com.niezhiliang.signature.utils.SealCircle;
import com.niezhiliang.signature.utils.SealConfiguration;
import com.niezhiliang.signature.utils.SealFont;
import com.niezhiliang.signature.utils.constant.ColorEnum;
import com.niezhiliang.signature.utils.constant.FontEnum;
import com.niezhiliang.signature.utils.seal.BasicSeal;


/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-23 15:21
 */
public class EllipseSeal extends BasicSeal {


    @Override
    public String companySeal(String companyName, ColorEnum colorEnum, FontEnum fontEnum, String serNo, String title) throws Exception {
        SealConfiguration configuration = new SealConfiguration();
        /**
         * 主文字
         */
        SealFont mainFont = new SealFont();
        mainFont.setBold(true);
        mainFont.setFontFamily(fontEnum.getFont());
        mainFont.setMarginSize(10);
        /**************************************************/
        mainFont.setFontText(companyName);
        mainFont.setFontSize(25);
        mainFont.setFontSpace(12.0);
        if (companyName.length() > 14) {
            mainFont.setFontSize(20);
            mainFont.setFontSpace(8.0);
        }


        configuration.setMainFont(mainFont);

        /**
         * 副文字
         */
        if (serNo != null && !"".equals(serNo)) {
            SealFont viceFont = new SealFont();
            viceFont.setBold(true);
            viceFont.setFontFamily(fontEnum.getFont());
            viceFont.setMarginSize(5);
            /**************************************************/
            viceFont.setFontText(serNo);
            viceFont.setFontSize(13);
            viceFont.setFontSpace(12.0);
            /***************************************************/

            configuration.setViceFont(viceFont);
        }


        /**
         * 抬头文字
         */
        if (title != null && !"".equals(title)) {
            SealFont titleFont = new SealFont();
            titleFont.setBold(true);
            titleFont.setFontFamily(fontEnum.getFont());
            titleFont.setFontSize(22);
            if (companyName.length() > 14) {
                titleFont.setFontSize(20);
            }
            /**************************************************/
            titleFont.setFontText(title);
            titleFont.setMarginSize(68);
            titleFont.setMarginSize(27);

            configuration.setTitleFont(titleFont);
        }

        /**
         * 图片大小
         */
        configuration.setImageSize(300);
        /**
         * 背景颜色
         */
        configuration.setBackgroudColor(colorEnum.getColor());
        /**
         * 边线粗细、半径
         */
        configuration.setBorderCircle(new SealCircle(4, 140, 100));

        return buildAndStoreSeal(configuration);
    }


}
