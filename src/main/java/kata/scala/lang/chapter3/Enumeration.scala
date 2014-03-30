object Enumeration {

  object Breed extends Enumeration {
    val doberman = Value("Doberman Pinscher")
    val yorkie = Value("Yorkshire Terrier")
    val scottie = Value("Scottish Terrier")
  }

  for (dog <- Breed.values) println(dog)

  object WeekDay extends Enumeration {
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
  }

  for (day <- WeekDay.values) println(day)

  def isWorkingDay(day: WeekDay.Value) = !(day == WeekDay.Sat || day == WeekDay.Sun)

  WeekDay.values filter isWorkingDay foreach println

}

