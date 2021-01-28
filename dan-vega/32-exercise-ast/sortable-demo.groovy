import groovy.transform.*

@ToString(includeNames=true)
@Canonical
@Sortable
class Product {
  String title
  BigDecimal price
}

def products = [
  new Product("Lamp", 19.99),
  new Product("Carrot", 0.49),
  new Product("Apple", 0.53),
]

def sortedProducts = products.sort false, Product.comparatorByTitle()
def cheapestProducts = products.sort false, Product.comparatorByPrice()
def expensiveProducts = products.sort false, { a, b -> b.price <=> a.price }

println "Unsorted: $products"
println "Sorted: $sortedProducts"
println "Cheapest: $cheapestProducts"
println "Expensive: $expensiveProducts"