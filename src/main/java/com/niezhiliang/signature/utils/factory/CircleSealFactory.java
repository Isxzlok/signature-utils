package com.niezhiliang.signature.utils.factory;

import com.niezhiliang.signature.utils.seal.BasicSeal;
import com.niezhiliang.signature.utils.seal.impl.CircleSeal;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-23 15:41
 */
public class CircleSealFactory extends SealFactory {

    @Override
    public BasicSeal getSeal() {
        return new CircleSeal();
    }
}
