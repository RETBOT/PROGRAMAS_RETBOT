#include <iostream>
#include <string>

using namespace std;

int main()
{
    string verinver; // vertebrado o invertebrado
    getline(cin,verinver);

    if(strcmp("vertebrado",verinver.c_str())==0){ // vertebrado
        string avemam; // ave o mamifero
        getline(cin,avemam);

        if(strcmp("ave",avemam.c_str())==0){ // ave
            string caroni; // carnivoro o onivoro
            getline(cin,caroni);

            if(strcmp("carnivoro",caroni.c_str())==0){
                cout<<"aguia"<<endl;
            }else if(strcmp("onivoro",caroni.c_str())==0){
                cout<<"pomba"<<endl;
            }

        }else if(strcmp("mamifero",avemam.c_str())==0){ // mamifero
            string oniher; // onivoro o herbivoro
            getline(cin,oniher);
            if(strcmp("onivoro",oniher.c_str())==0){
                cout<<"homem"<<endl;
            }else if(strcmp("herbivoro",oniher.c_str())==0){
                cout<<"vaca"<<endl;
            }
        }

    }else if(strcmp("invertebrado",verinver.c_str())==0){ // invertebrado
        string insane; // inseto o anelideo
        getline(cin,insane);

        if(strcmp("inseto",insane.c_str())==0){
            string hemher; // hematofago o herbivoro
            getline(cin,hemher);

            if(strcmp("hematofago",hemher.c_str())==0){
                cout<<"pulga"<<endl;
            }else if(strcmp("herbivoro",hemher.c_str())==0){
                cout<<"lagata"<<endl;
            }

        }else if(strcmp("anelideo",insane.c_str())==0){
            string hemoni; // hematofago o onivoro
            getline(cin,hemoni);

            if(strcmp("hematofago",hemoni.c_str())==0){
                cout<<"sanguessuga"<<endl;
            }else if(strcmp("onivoro",hemoni.c_str())==0){
                cout<<"minhoca"<<endl;
            }

        }
    }
    return 0;
}
