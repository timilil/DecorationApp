package com.example.timil.arproject

import android.util.Log

object GlobalModel {

    val furnitures: kotlin.collections.MutableList<Furniture> = java.util.ArrayList()

    init {

        //Log.d("USR", "This ($this) is a singleton")

        furnitures.add(Furniture(R.drawable.arild,"Sofa", "Just for chilling", "IKEA-Arild_2_Seat_Sofa-3D.sfb"))
        furnitures.add(Furniture(R.drawable.kallax,"Shelf",  "Nice for books", "IKE170011.sfb"))
        furnitures.add(Furniture(R.drawable.tvstorage,"Television stand", "Perfect for you TV", "IKEA-TV_Storage_combination-3D.sfb"))
        furnitures.add(Furniture(R.drawable.ikeabed,"Bed",  "The best part at the end of the day", "IKEA-Beddinge_Sofa_bed_frame-3D.sfb"))
        furnitures.add(Furniture(R.drawable.armchairikea,"Chair","Sit", "IKEA-Poang_Armchair-3D.sfb"))
        furnitures.add(Furniture(R.drawable.bjurstatable,"Table", "Eat", "IKEA-Round_Bjursta_Table_and_Chairs-3D.sfb"))
        furnitures.add(Furniture(R.drawable.arstidwalllamp,"Lamp", "The light that will bring you happiness in the morning", "IKE160153.sfb"))
        furnitures.add(Furniture(R.drawable.statue,"Statue",  "Amazing statue", "statue3.sfb"))

    }


}