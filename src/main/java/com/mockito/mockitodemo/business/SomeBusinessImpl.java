package com.mockito.mockitodemo.business;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    int findGreatest(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for(int value : data){
            if(greatest < value)
                greatest = value;
        }
        return greatest;
    }
}

interface DataService{
    int[] retrieveAllData();
}