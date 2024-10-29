package com.lbg.classes;

public interface ISteerable {
    String turnLeft();

    String turnRight();


    // this stops code breaking later on as all above methods would be implemented if you added another all files where implementation has happened would break
    default String brandNewMethod(){
        return "Someone added this later";
    }
}
