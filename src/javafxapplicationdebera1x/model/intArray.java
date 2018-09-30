/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationdebera1x.model;


public class intArray 
{
    private static final int DEAFULT_CAPACITY = 10;
    
    private int count;
    //private int count2;
    //private int count3;
    
    private int[] data;
    
    public intArray()
    {
        this(DEAFULT_CAPACITY);
    }
    
    public intArray(int capacity)
    {
        if (capacity < 0)
            data = new int[DEAFULT_CAPACITY];
        else
            data = new int[capacity];
    }
    

    
    public int[] getData()
    {
        return data;
    }
    
    /*public intArray(int[] source, int sourceCount)
    {
        this(source.length);
        addAll(source, sourceCount);
    }*/
    
    /*public intArray(int[] source)
    {
        this(source.length);
        addAll(source);
    }*/
    
    /*public intArray(intArray source)
    {
        this(source.getLength());
        addAll(source);
    }*/
    
    public void add(int elem)
    {
        data[count] = elem;
        count++;
    }
   
    
    public int getCount()
    {
        return count;
    }

    
    /*public void add(int index, int elem)
    {
        
    }*/
    
    /*public void addAll(int[] source, int countSource)
    {
        for(int i = 0; i < countSource; i++)
            add(source[i]);
    }*/
    
    /*public void addAll (int[] source)
    {
        addAll(source, source.length);
    }*/
    
    /*public void addAll (intArray source)
    {
        for (int i = 0; i < source.getCount(); i++) //source.getCount(); i++)
            add(source.get(i));
    }*/


    
    public int getLength()
    {
        return data.length;
    }
    
    public int promedio()
    {
        return 0;
    }
    
    public int suma()
    {
        int suma1 = 0;
        for (int i = 0; i < count; i++)
        {
            suma1 += data[i];
        }
        return suma1;    
    }
    
    public int getMin()
    {
        int temporal = 0;
        for (int i = 0; i < count; i++)
        {
            for (int j = i+1; j < count; j++)
            {
                if (data[i] > data[j])
                {
                    temporal = data[i];
                    data[i] = data[j];
                    data[j] = temporal;
                }
            }
        }
        return data[0];
    }
    
        public int getMax()
    {
        return data[count-1];
    }
        

        

}
