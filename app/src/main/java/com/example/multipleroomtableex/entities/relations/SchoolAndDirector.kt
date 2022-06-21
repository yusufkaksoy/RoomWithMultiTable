

import androidx.room.Embedded
import androidx.room.Relation
import com.example.multipleroomtableex.entities.data.Director
import com.example.multipleroomtableex.entities.data.School


data class SchoolAndDirector(

    @Embedded val school: School,
    @Relation(parentColumn = "schoolName", entityColumn = "schoolName")
    val director: Director
    )
//Relation annotionu :
//one-to-one  olduğu için ekstra tabloya ihtiyacımız yok. n-to-2m olsa @Entity olurudu.
//embedded class üst sınıftaki datanın  anlık görüntülenmesini sağlar.
