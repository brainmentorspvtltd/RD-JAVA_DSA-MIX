// class name is on PascalCase
// e.g FunctionDemo, PrintWriter, SavingAccount
class FunctionDemo{
    // fn name written in small letter
    // also it use camelCase
    // e.g getBalance()
    // void - no return 
    // show - it is the name of a function
    // fnName() - Banana Bracket
    // Define a Function
    // static - When class is loaded static things will be loaded.
    static void show() { // start of a function
        // Statements 
        if(10>2){
            return ; // exit from the fn.
        }
        for(int i = 1; i<=10; i++){
            System.out.println("Print "+i);
        }
        System.out.println("Show...");
    } // end of a function
    public static void main(String[] args) {
      // Call a Function
        show();
        System.out.println("Main....");
    }
}