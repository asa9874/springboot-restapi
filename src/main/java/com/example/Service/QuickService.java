package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.itemEntity;
import com.example.Repository.ItemRepository;
import com.example.dto.itemDTO;

@Service
public class QuickService {

    @Autowired
    private ItemRepository itemRepository;

    public boolean registerItem(itemDTO item){
        return true;
    }


    public itemDTO getItemById(String id){
        itemEntity itemEntitiy=itemRepository.findById(id).get();
        itemDTO itemDTO = new itemDTO();
        itemDTO.setId(itemEntitiy.getId());
        itemDTO.setName(itemEntitiy.getName());
        return itemDTO;
    }
}
