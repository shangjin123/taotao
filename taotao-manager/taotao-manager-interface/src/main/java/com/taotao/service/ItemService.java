package com.taotao.service;

import com.taotao.pojo.TbItem;

import com.taptao.pojo.LayuiResult;

public interface ItemService {
    TbItem findTbItemById(Long itemId);

    LayuiResult findTbItemByPage(int page, int limit);
}
