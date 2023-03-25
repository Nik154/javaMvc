package assignmentJMVC;

public class MyModel {
	private int num1,num2;
    char ch;
    
    MyModel(int n1,int n2,char ch)
    {
    	this.num1 = n1;
    	this.num2 = n2;
    	this.ch = ch;
    }
    
    MyModel()
    {
    	
    }
    
    public int addV(int num1,int num2)
    {
    	return num1+num2;
    }
    
    public int subV(int num1,int num2)
    {
    	return num1-num2;
    }
    
    public int mulV(int num1,int num2)
    {
    	return num1*num2;
    }
    
    public int DivV(int num1,int num2)
    {
    	return num1/num2;
    }
    
    public int modV(int num1,int num2)
    {
    	if(num2==0) {return 0;}
    	return num1%num2;
    }
    

    public int Calcs()
    {
        switch (ch) {
            case '+':
                return addV(num1,num2);
		case '*':
                return mulV(num1,num2);
		case '/' :
                return DivV(num1,num2);
		case '-' :
                return subV(num1,num2);
		case '%' :
				return modV(num1,num2);
                
        }
		return ch;
    }

}
