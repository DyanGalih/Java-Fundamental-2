package com.dyangalih;

import com.dyangalih.tutorial.flatmap.set.SetupStudent;
import com.dyangalih.tutorial.flatmap.string.FlatMap;
import com.dyangalih.tutorial.stream.CollectorStream;
import com.dyangalih.tutorial.stream.IntegerStream;
import com.dyangalih.tutorial.stream.ManyStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FlatMap flatMap = new FlatMap();
        flatMap.flatMapWithOutput();

        SetupStudent setupStudent = new SetupStudent();
        setupStudent.setData();

        System.out.println("===========");

        CollectorStream collectorStream = new CollectorStream();
        collectorStream.setCollector();

        ManyStream manyStream = new ManyStream();
        manyStream.startStream();

        IntegerStream integerStream = new IntegerStream();
        integerStream.convertStream();
    }
}
