class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int index=0; int total =0;
        int fuelinTank = 0; 
        
        for(int i =0; i<gas.length;i++){
            
         int fuelSum = gas[i]-cost[i]; // calculating remaining gas after every visit to gas stations - fuel consumed.
            
            fuelinTank += fuelSum; // updating fuel inside tank
            
            if(fuelinTank<0){ // when fuel becomes -ve, means that point and before that point can not be the starting 
                              // point of the journey, so we have to start from next point(index+1), with 0 fuel inside.
                
                index = i+1; // new point to start the journey.
                fuelinTank = 0; // reset fuel in Tank to zero, to calculate from new point
            }
            
            total += fuelSum; // gives idea of total gas-cost, it it is +ve means solution exist.
        }
        
        return total < 0 ? -1 : index;
        
    }
}