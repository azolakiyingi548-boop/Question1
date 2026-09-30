/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

/**
 *
 * @author Student
 */
public class Question1 {

    public static void main(String[] args) {
        String [] jobs = {"BATHROOMS", "KITCHENS", "GARDEN"};
        String [] years = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        int [][] makeovers = {{8, 2, 5}, {7, 4, 5}, {5, 5, 2}, {2, 2, 3}, {7, 7, 9}, {7, 8, 5}};
        
        System.out.println("------------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-16s", "");
        for(int i = 0; i < jobs.length; i++){
            System.out.printf("%-12s", jobs[i]);
        }
        System.out.println();
        for(int i = 0; i < years.length; i++){
            for(int makeover = 0; makeover < makeovers.length; makeover++){
                System.out.printf("%-12d", makeover);
                
            }
        }
    }
}
