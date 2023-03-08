package com.example.versionupdated.testCodes;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class after11 {

    public void coolFastImmutableCollections(){
        // immutable collections
        Set<String> immutableSet = Set.of("a", "b", "c");
        List<String> immutableList = List.of("a", "b", "c");
        Map<String, String> immutableMap = Map.of("1", "a", "2", "b");
        // immutableSet.add("d"); // compile error

        // to edit
        Set<String> newSet = new HashSet<>(immutableSet);
        newSet.add("d");
    }

    public void javaAlsoHaveVar(){
        var stringVar = "Hello";

        // get variable type in compile time
        var listVar = List.of("1", 2, 3L);
        var listVarType = listVar.getClass();
        System.out.println(listVarType);

        for (var item : listVar) {
            System.out.println(item);
        }
    }

    public void textBlock(){
        var textBlock = """
                Hello
                World
                """;
        System.out.println(textBlock);
    }

    public void switchExpression(){
        var name = "a";
        var returnableSwitch = switch (name) {
            case "a" -> "a";
            case "b" -> "b";
            default -> "c";
        };
        System.out.println(returnableSwitch);
    }

    public void patternMatchingForInstanceOf(){
        Object obj = "Hello";
        if (obj instanceof String str) {
            System.out.println(str);
        }
    }

    // this feature supported after JDK 17 Preview
    public void patternMatchingForSwitch(){
//        Object obj = "Hello";
//        var returnableSwitch = switch (obj) {
//            case String str -> str;
//            case Integer i -> i;
//            default -> "c";
//        };
//        System.out.println(returnableSwitch);

    }

    public void patternMatchingForCatch(){
        try {
            throw new Exception("Hello");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void applyLambda(){
        Function<String, String> lambda = (String str) -> str;
        System.out.println(lambda.apply("Hello"));
    }

    public record GlobalRecordClass(
            String name,
            String value
    ){
        static String STATIC_VARIABLE = "static variable";

        public String getInfo() {
            return this.name + " " + this.value;
        }

        public static String get() {
            return STATIC_VARIABLE;
        }
    }

    public void recordDataClass(){
        record LocalRecordClass(
                String name,
                String value
        ){}
        Record record = new GlobalRecordClass("Hello", "World");
        Record record2 = new LocalRecordClass("Hello", "World");
        System.out.println(record);
        System.out.println(record2);
    }


}
