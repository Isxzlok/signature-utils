package com.niezhiliang.signature.utils;

import com.niezhiliang.signature.utils.constant.ColorEnum;
import com.niezhiliang.signature.utils.constant.FontEnum;
import com.niezhiliang.signature.utils.factory.CircleSealFactory;
import com.niezhiliang.signature.utils.factory.SealFactory;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-23 11:25
 */
public class UtilsTest {

    public static void main(String[] args) throws Exception {

        String base64 = SealUtils.companyCircleSeal("浙江杭州江干下沙某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI,"1234567899876","合同专用");
        //System.out.println(base64);

        //SealFactory sealFactory = new CircleSealFactory();
        //String base64 = sealFactory.getSeal().companySeal("浙江杭州江干下沙某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI,"1234567899876","合同专用");
       // System.out.println(base64);

        BASE64Decoder decoder = new BASE64Decoder();
        try
        {
            //Base64解码
            byte[] b = decoder.decodeBuffer(base64);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {
                    //调整异常数据
                    b[i]+=256;
                }
            }

            String imgFilePath = "/Users/xiongzhilong/Desktop/photo/5.jpg";
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
