package com.hotmail.bess410.tacocloud.data;

import com.hotmail.bess410.tacocloud.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
