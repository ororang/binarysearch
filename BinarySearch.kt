fun main(){
    val arrays = arrayOf(3,12,14,18,22,32,39,48,58,405)
    val low = 0
    val high = arrays.size-1
    val key = 18
    binarySearch(arrays,low,high,key)
}


fun binarySearch(array:Array<Int>,low:Int,high:Int,key:Int):Int{
    if(low <= high){
        val mid = (high+low)/2
        if(array[mid] == key){
            println("Element find in index: ${mid+1} ")
            return mid
        }else if(key < array[mid]){
            binarySearch(array,low,mid-1,key)
        }else if(key > array[mid]){
            binarySearch(array,mid+1,high,key)
        }else if(low > high){
            println("Unsuccessful search")
            return -1
        }
    }
    return -1
}
