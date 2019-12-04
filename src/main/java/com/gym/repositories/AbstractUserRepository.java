package com.gym.repositories;

import com.gym.models.users.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractUserRepository<M extends User> {

    final protected Map<Integer,M> data = new HashMap<>();

    public List<M> getAll(){
        List<M> list = new ArrayList<>();
        data.forEach((integer, model) -> list.add(model));
        return list;
    }

    public M findById(int id){
        checkIsModelExist(id);
        return data.get(id);
    }

    public M add(M addModel){
        if (data.containsKey(addModel.getUserId()))
            throw new IllegalArgumentException("Object id: " + addModel.getUserId() + " exist in repository");

        data.put(addModel.getUserId(),addModel);
        return addModel;
    }

    public void deleteById (int id){
        checkIsModelExist(id);
        data.remove(id);
    }

    public M updateById (int id, M updateModel){
        checkIsModelExist(id);
        data.remove(id);
        updateModel.setUserId(id);
        data.put(id,updateModel);
        return updateModel;
    }

    private void checkIsModelExist(int id){
        if (!data.containsKey(id))
            throw new IllegalArgumentException("Can't find object id: " + id + " in repository");
    }


}
