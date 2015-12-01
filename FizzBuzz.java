class Solution {
    /**
     * param n: As description.
     * return: A list of strings.
     */
    public ArrayList<String> fizzBuzz(int n) {  //返回类型位String的ArrayList 
        ArrayList<String> arraylist = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){  // % 跟 / 
                arraylist.add("fizz buzz");
            }else if(i % 5 ==0){
                arraylist.add("buzz");
            }else if(i % 3 == 0){
                arraylist.add("fizz");
            }else{
                arraylist.add(i+""); //String.valueOf(i)    如果不知道valueOf(i) 可以用i＋""
            }
        }
        return arraylist;
    }
}
