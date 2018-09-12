/*問1*/

document.write("---------第1問---------");
document.write("<br>");

for(i=1;i<=5;i++){
    document.write("★");
}

/*問2*/
document.write("<br>");
document.write("---------第2問---------");
document.write("<br>");

for(i=1;i<=2;i++){
    for(j=1;j<=3;j++){
        document.write("★");
    }
    document.write("<br>");
}
/*問3*/
document.write("---------第3問---------");
document.write("<br>");

for(i=1;i<=2;i++){
    for(j=5;j>0;j--){
        document.write("☆");
        }
    document.write("<br>");
}

/*問4*/
document.write("---------第4問---------");
document.write("<br>");

for(i=4;i>0;i--){
    for(j=1;j<=5;j++){
        document.write("★");
    }
    document.write("<br>");
}
/*問5*/
document.write("---------第5問---------");
document.write("<br>");

for(i=1;i<5;i++){
    for(j=1;j<=3;j++){
    document.write("★");
    }
    document.write("<br>");
}
/*問6*/
document.write("---------第6問---------");
document.write("<br>");

for(i=1;i<=3;i++){
    for(j=3;j>0;j--){
        if(j%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
        document.write("<br>")
}
/*問7*/
document.write("---------第7問---------");
document.write("<br>");

for(i=1;i<=5;i++){
    for(j=1;j<=5;j++){
        if(j%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
        document.write("<br>")
}
/*問8*/
document.write("---------第8問---------");
document.write("<br>");

for(i=0;i<5;i++){
    for(j=0;j<=i;j++){
        document.write("★");
    }
        document.write("<br>")
}


document.write("<br>")
document.write("<br>")
document.write("<br>")


/*関数-問1*/
document.write("---------関数第1問---------");
document.write("<br>");

function circle(r,pi=3.14){
    return (r*r)*pi;
}
document.write("半径5cmの円の面積は"+circle(5)+"<br>");
document.write("半径7cmの円の面積は"+circle(7)+"<br>");
document.write("半径10cmの円の面積は"+circle(10)+"<br>");


/*関数-問2*/
document.write("---------関数第2問---------");
document.write("<br>");

function goukei(otona,kodomo){
    adult = 500;        //おとなの入場料金
    children = 200;     //子供の入場料金
    var r = (otona*adult)+(kodomo*children)
    return r;
}

document.write("Aグループの合計金額は"+goukei(2,4)+"です。<br>");
document.write("Bグループの合計金額は"+goukei(1,5)+"です。<br>");
document.write("ACループの合計金額は"+goukei(3,7)+"です。<br>");
document.write("---------おしまい---------");

