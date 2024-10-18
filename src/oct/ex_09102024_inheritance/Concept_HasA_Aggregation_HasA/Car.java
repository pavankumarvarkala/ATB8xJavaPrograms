package oct.ex_09102024_inheritance.Concept_HasA_Aggregation_HasA;

import oct.ex_09102024_inheritance.Concept_HasA_Aggregation_HasA.Concept_IsA_Composite_HasA.Mahindra;
import oct.ex_09102024_inheritance.Concept_HasA_Aggregation_HasA.Concept_IsA_Composite_HasA.Tesla;

public class Car {
    //Car has a Engine and Tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
        new Tesla().test();
        new Mahindra().test2();
    }
}
