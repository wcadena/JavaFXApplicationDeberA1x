/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationdebera1x.model;

import java.util.Arrays;

public final class IntArray2 {
    private static final int DEFAULT_CAPACITY = 5;
    /**
     * The number of elements in this list.
     * @serial the list size
     */
    private int count;
    /**
     * Where the data is stored.
     */
    private int[] data;


    public IntArray2()
    {
        this(DEFAULT_CAPACITY);
    }
    /*** Construct a new IntArray2 with the supplied initial capacity.
     *
     * @param capacity initial capacity of this IntArray2
     * @throws IllegalArgumentException if capacity is negative */
    public IntArray2(int capacity)
    {
        if (capacity < 0)
            data = new int[DEFAULT_CAPACITY]; /*debería lanzarse
una excepción, pues es incorrecto que la capacidad tenga un valor
menor que cero, no obstante se garantiza la construcción de la
instancia con la capacidad por defecto*/
        else
            data = new int[capacity];
    }
    /**
     * Construct a new IntArray2, and initialize it with the elements
     * in the supplied Array.
     *
     * @param source the Array whose elements will initialize this list
     * @param sourceCount the elems count in the source Array
     * @throws NullPointerException if source is null
     */
    public IntArray2(int[] source, int sourceCount)
    {
        this(source.length);
        addAll(source, sourceCount);
    }
    public IntArray2(int[] source)
    {
        this(source.length);
        addAll(source);

    }
    /**
     * Construct a new IntArray2 from another, and initialize it with
     * the elements in the supplied instance.
     * @param elem
     * @throws NullPointerException if source is null
     */
/*public IntArray2(IntArray2 source)
{
this(source.getLength());
addAll(source);
}*/


    public void add(int elem)
    {
        if (count < DEFAULT_CAPACITY){
            count++;
            data[count] = elem;
        }
    }
    public void add(int index, int elem)
    {
        if (count < DEFAULT_CAPACITY){
            count++;
            data[index] = elem;
        }
    }
    public void addAll(int[] source, int countSource)
    {
        for (int i = 0; i < countSource; i++)
            add(source[i]);
    }
    public void addAll(int[] source)
    {
        addAll(source, source.length);
    }
    /*
    public void addAll(IntArray2 source)
    {
    for (int i = 0; i < source.getCount(); i++)
    add(source.get(i));
    }
    */
    public int getLength(){
        return data.length;
    }
    public void clear()
    {

        for(int i = 0; i<count;i++)
        {
            data[i]= 0;
        }

    }
    public boolean exists(int elem)
    {

        for(int i = 0; i<count;i++)
        {
            if(elem == data[i])
            {
                return true;

            }
        }
        return false;
    }
    public int find(int elem)
    {

        for(int i = 0; i<count;i++)
        {

            if(elem == data[i])
            {
                return data[i];
            }
        }

        return -1;
    }

    public boolean isEmpty()
    {


        if(count == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int removeAt(int index)
    {

        for(int i = index;i<count;i = i+2)
        {
            data[index] = data[index+1];
        }

        return -1;
    }
    public float average()
    {

        float sum=0;

        for(int i = 0; i<count;i++)
        {
            sum = data[i]+sum;
        }


        return (sum/count);


    }
    public int countEqualNumber(int number)
    {

        int c =0;
        for(int i = 0; i<count;i++)
        {
            if(data[i]==number)
            {
                c++;
            }
        }
        return c;
    }
    public int countBiggerThan(int number)
    {

        int c =0;
        for(int i = 0; i<count;i++)
        {
            if(data[i]>number)
            {
                c++;
            }
        }
        return c;

    }
    /** Count the elements which value is minor than a given number.
     * @param number the given value to compare with.
     * @return
     */
    public int countSmallerThan(int number)
    {

        int c =0;
        for(int i = 0; i<count;i++)
        {
            if(data[i]<number)
            {
                c++;
            }
        }
        return c;
//para implementar como estudio indepeediente

    }
    public int indexBiggerValue()
    {
//para implementar como estudio independiente
        return -1;
    }
    /** Return the index of the last ocurrence of the lowest elem of
     * the collection.
     * @return int the index of the biggest.*/
    public int indexLowerValue()
    {
//para implementar como estudio independiente
        return -1;
    }
    public int sum()
    {

        int sum=0;

        for(int i = 0; i<count;i++)
        {
            sum = data[i]+sum;
        }

//para implementar como estudio independiente
        return sum;
    }

}
