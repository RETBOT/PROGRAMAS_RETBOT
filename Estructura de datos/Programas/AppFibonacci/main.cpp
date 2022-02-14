/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: admin
 *
 * Created on 23 de noviembre de 2020, 04:53 PM
 */

#include <iostream>

using namespace std;

/*
 * 
 */
  int fibonacci(int n){
    int f=0;
    if(n==1||n==2)
        return 1;
    else
        f=fibonacci(n-1)+fibonacci(n-2);
    return f;
    }
  
int main(int argc, char** argv) {
    int fibo = fibonacci(5);
    cout<<"Fibonacci de 5 ="<<fibo<<endl;
    return 0;
}

