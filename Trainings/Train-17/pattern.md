Pattern : Decorator

Component : Price
    operation() : calculatePrice()
Decorator : N/A (représenté par DiscountedPrice directement, car pas de classe abstraite intermédiaire)
    component : N/A
    operation() : N/A
ConcreteComponent : FixedPrice
    operation() : calculatePrice()
ConcreteDecorator : DiscountedPrice
    operation() : calculatePrice()