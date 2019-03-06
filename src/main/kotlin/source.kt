

fun main() {

}

// Converted JAVA Logic
// set global variables to be used by all functions
val dist        = 0.0                       //total distance
val time        = 0                         //in total secs
val pace        = 0                         //in total secs
val thr         = 0                         //cd ..4hr component for time
val tmin        = 0                         //min component for time
val tsec        = 0                         //sec component for time
val phr         = 0                         //hr component for pace
val pmin        = 0                         //min component for pace
val psec        = 0                         //sec component for pace
//val punit //unit pace is in (the per unit, aka mile, kilometer, quarter, half, etc)
val maradist    = "26.21875"                //marathon distance in miles
val halfmaradist= "13.109375"               //half marathon distance in miles
var shgt        = 34                        // height of rows in split table to compute height of subwindow

enum class dunit {                          //type of unit dist is miles or kilometers
    Miles,
    Kilometers
}
enum class event {                          //event distance like marathon, half-marathon
    Marathon,
    Halfmarathon,
    FiveK,
    FiveM,
    EightK,
    TenK,
    FifteenK,
    TenM,
    TwentyK,
    FifteenM,
    TwentyfiveK,
    ThirtyK,
    TwentyM
}