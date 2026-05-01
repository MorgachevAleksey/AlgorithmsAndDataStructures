package com.morgachev.aleksey.algo.l00_codeWarsTasks; //тот же пакет где лежит исходник

import org.junit.jupiter.api.Test; //аннотация теста
import  static org.junit.jupiter.api.Assertions.assertEquals; //тест на соответсвие возвращаемого значения ожидаемому

public class T1_HelloWorldTest { //предпочтительнее не public, суффикс Test
    @Test
    void greetShouldReturnHelloWorld(){ //описательно имя в формате предложения, что проверяется + что ожидается
        String actual = T1_HelloWorld.greet(); //результат в переменную
        assertEquals("hello world!", actual); //сравнения ожидаемого результата с реальным в переменной
    }
}
