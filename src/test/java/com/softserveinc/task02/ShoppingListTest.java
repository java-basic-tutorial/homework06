package com.softserveinc.task02;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    @Test
    void shouldHaveFieldItems() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        ShoppingList shoppingList = ShoppingList.class.getDeclaredConstructor().newInstance();
        assertNotNull(shoppingList, "ShoppingList should have a public constructor without parameters");
        Field items = ShoppingList.class.getDeclaredField("items");
        assertTrue(Modifier.isPrivate(items.getModifiers()));
        assertFalse(Modifier.isStatic(items.getModifiers()));
        items.setAccessible(true);
        Object field = items.get(shoppingList);
        assertNotNull(field, "ShoppingList should have private field items");
        assertEquals(ArrayList.class, field.getClass());
    }

    @Test
    void add() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ShoppingList shoppingList = ShoppingList.class.getDeclaredConstructor().newInstance();
    }

    @Test
    void delete() {
    }
}