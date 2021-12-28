#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int secretNumber = 7;
    int guess;
    int guessCount=0;
    int guessLimit=3;
    int outOfGuess=0;
    while(guess!=secretNumber and outOfGuess==0){
        if(guessCount<guessLimit){
            printf("Enter a number : ");
            scanf("%d",&guess);
            guessCount++;
        }else{
            outOfGuess=1;
        }
    }
    if(outOfGuess==1){
        printf("Out of guesses : \n");
    }else{
    printf("You win : \n");
    }
    return 0;
}