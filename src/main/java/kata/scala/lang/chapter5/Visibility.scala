package scopeA {
  class PublicClass1 {
    val publicField = 1

    class Nested {
      val nestedField = 1
    }

    val nestedField = new Nested
  }
}

package scopeB {
  class PublicClass2 extends scopeA.PublicClass1

  class UsingClass(val publicClass: scopeA.PublicClass1) {
    def method = "Using class: " + publicClass.publicField +
      " field " + publicClass.nestedField.nestedField
  }
}

object Visibility {
	println(new scopeB.UsingClass(new scopeA.PublicClass1) method)
}