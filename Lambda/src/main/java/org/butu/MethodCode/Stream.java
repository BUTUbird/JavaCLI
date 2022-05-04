package org.butu.MethodCode;

import org.butu.model.entity.Author;

import java.util.List;

import static org.butu.MethodCode.GetAuthors.getAuthors;

/**
 * @program: JavaCLI
 * @description:
 * @packagename: org.butu.MethodCode
 * @author: BUTUbird
 * @date: 2022-05-04 00:40
 **/
public class Stream {
    public static void main(String[] args) {
        test1();
    }
    public static void  test1(){
        List<Author> authors = getAuthors();
        authors.stream()
                .filter(author -> author.getName().length()>1)
                .forEach(author -> System.out.println(author.getName()));
    }
}
