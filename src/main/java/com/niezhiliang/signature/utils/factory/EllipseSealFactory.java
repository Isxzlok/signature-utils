package com.niezhiliang.signature.utils.factory;

import com.niezhiliang.signature.utils.seal.BasicSeal;
import com.niezhiliang.signature.utils.seal.impl.EllipseSeal;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-23 15:42
 */
public class EllipseSealFactory extends SealFactory {

    @Override
    public BasicSeal getSeal() {
        return new EllipseSeal();
    }
}
