package com.yuruiyin.richeditor.sample.model

import com.yuruiyin.richeditor.model.IBlockImageSpanObtainObject
import com.yuruiyin.richeditor.sample.enumtype.BlockImageSpanType

/**
 * Title: 图片实体
 * Description:
 *
 * @author yuruiyin
 * @version 2019-05-06
 */
data class ImageVm(val path: String, val id: String): IBlockImageSpanObtainObject {
    override fun getType(): String = BlockImageSpanType.IMAGE
}