public class NumStatsArray{

  private final double[] arr;

  public NumStatsArray(double[] arr){
    this.arr = arr;
  }

  public String toString(){
    String str = "{";
    for (int i = 0; i < arr.length; i++) {
      double item = arr[i];
      if (i != arr.length-1) {
        str += item + ", ";
      } else {
        str += item;
      }
    }
    str += "}";
    return str;
  }

  public double average(){
    double sum = 0;
    for (double item : arr) {
      sum = sum + item;
    }
    
    return sum / arr.length;
  }

  public double range(){
    double min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    double max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return (max - min);
  }

  public int sortStatus() {
    int increase = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] >= arr[i - 1]) {
        increase += 1;
      }
    }
    int decrease = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] <= arr[i - 1]) {
        decrease += 1;
      }
    }
    if (increase == arr.length - 1) {
      return 1;
    } else if (decrease == arr.length - 1) {
      return -1;
    } else {
      return 0;
    }
  }

}