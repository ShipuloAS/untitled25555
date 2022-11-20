public class Counter {
private String name;
private int value;
public Counter(String countName, int countValue){
   this.name=countName;
   this.value=countValue;
}
public Counter(String countName){
    this(countName,0);

}
int cPlus() {
    this.value++;
return this.value;
}
int cPlus(int val){
    this.value=this.value+val;
return this.value;

}
    int cMinus() {
        this.value--;
        return this.value;
    }
    int cMinus(int val){
        this.value-=val;
        return this.value;

    }


int GetVal(){
    return this.value;
    }

}
