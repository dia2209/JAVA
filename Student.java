public class Student {
   int Mathematics;
   int Project;
   int BusinessCommunication;
   int Java;
   int DSA;

   public void info(int a, int b, int c, int d, int e){
    this.Mathematics=a;
    this.Project=b;
    this.BusinessCommunication=c;
    this.Java=d;
    this.DSA=e;
    System.out.println("Mathematics" + "=" + this.Mathematics);
    System.out.println("Project" + "=" + this.Project);
    System.out.println("BusinessCommunication" + "=" + this.BusinessCommunication);
    System.out.println("Java" + "=" + this.Java);
    System.out.println("DSA" + "=" + this.DSA);
  }

  public void calcPercent(){
    int obtainedmarks=(this.Mathematics+this.Project+this.BusinessCommunication+this.Java+this.DSA);
    int maxmarks=5*100;
    float total=(float)obtainedmarks/maxmarks*100;
    System.out.printf("The percentage is %.2f\n",total);
  }
}




