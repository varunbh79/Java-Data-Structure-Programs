package com.datastructures.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayListRemoveDemo {

    public static void main (String[] args) {

        String[] languageNames = {"C", "C++", "Java", "Scala", "Scala", "JavaScript", "Python", "Ruby", "Perl", "Groovy", "Shell Script"};
        List<String> programmingLanguages = new ArrayList ( Arrays.asList ( languageNames ) );
        System.out.println ( "Removing by index " + programmingLanguages );
        boolean isRemoved = programmingLanguages.remove ( "Shell Script" );
        System.out.println ( "Removing by object : " + isRemoved + programmingLanguages );
        List<String> scriptingLanguages = new ArrayList<> ( Arrays.asList ( "Groovy", "Perl", "Python", "Ruby" ) );
        List<String> functionalLanguages = new ArrayList<> ( Arrays.asList ( "Scala", "JavaScript", "Java", "Python" ) );
        boolean isScriptingLangRemoved = programmingLanguages.removeAll ( scriptingLanguages );
        System.out.println ( "After Removing Scripting" + isScriptingLangRemoved + programmingLanguages );
        programmingLanguages.removeIf ( language -> !functionalLanguages.contains ( language ) );
        System.out.println ( "Functional Languages : " + programmingLanguages );
        System.out.println ( Collections.frequency ( programmingLanguages, "Scala" ) );
        Collections.reverse ( programmingLanguages );
        System.out.println ( programmingLanguages );
        int position = Collections.binarySearch ( functionalLanguages, "Python" );
        System.out.println ( position );
    }
}
