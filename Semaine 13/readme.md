# 1.Template Method

| Théorique             | Pratique                    |
|-----------------------|-----------------------------|
| AbstractClass         | Shape                       |
| ConcreteClass         | Circle & polygon            |
| TemplateMethod()1     | draw()                      |
| PrimitiveOperation1() | drawBorder()                |
| TemplateMethod2()     | flipHorizontalAbout()       |
| PrimitiveOperation2() | flipBorderHorizontalAbout() |
| TemplateMethod3()     | flipVerticalAbout()         |
| PrimitiveOperation3() | flipBorderVerticalAbout()   |
| TemplateMethod4()     | rotateAbout()               |
| PrimitiveOperation4() | rotateBorderAbout()         |
| TemplateMethod5()     | translate()                 |
| PrimitiveOperation5() | translateBorder()           |


# 2. Iterator

- Iterator : ShapeIterator
- ConcreteIterator : ShapeIterator
  - next() : next()
  - hasNext() : hasNext()
- Aggregate : ShapeVector
- ConcreteAggregate : ShapeVector
  - iterator() : iterator()


# 3. Composite

- IComponent : ShapeMutationStrategy ___interface ou abstraite___
- Leaf : ___Toutes les classes qui extends ShapeMutationStrategy___
  - ExplodeShapeMutationStrategy
  - GeneralShapeMutationStrategy
  - GrowShapeMutationStrategy
  - ImplodeShapeMutationStrategy
  - SpinShapeMutationStrategy
- Composite : CompositeShapeMutationStrategy ___extends ShapeMutationStrategy___


# 4. Observer

- Observer : KaleidoscopeView
  - update() : update()
- Subject : Kaleidoscope
  - registerObserver : register()
  - notifyObserver : turn()
- ConcreteObserver :
  - FliK...View
  - NegativeK...View
  - RotateK...View
  - TraditionalK...View


# 5. Strategy

- Strategy : ShapeMutationStrategy
  - execute() : mutate()
- ConcreteStrategy : 
  - GeneralShapeMutationStrategy
    - execute() : mutate()
- context : Kaleidoscope


# 6. Prototype

- Client : 
  - FlipK...View
  - NegativeK...View
  - RotateK...View
  - TraditionalK...View
- Prototype : Shape
  - clone() : copy()
- ConcretePrototype : 
  - Circle
  - Rectangle
  - Triangle
  - Square


# 7. AbstractFactory 

- Client : Kaleidoscope
- AbstractFactory : ShapeFactory
- ConcreteFactory : 
  - GenerateShapeFactory
  - CircleShapeFactory
- AbstractProduct : Shape
- Product : 
  - Circle
  - Rectangle
  - Triangle
  - Square
- CreateProduct : createShape()


# 8. Template Method

- AbstractClass : KaleidoscopeView
- ConcreteClass : 
  - FlipKaleidoscope
  - NegativeKaleidoscope
  - RotateKaleidoscope
  - TraditionalKaleidoscope
- TemplateMethod()1 : paint()
- PrimitiveOperation1() : drawShape()


# 9. Dans KaleidoscopeControl

# 10. Dans ShapeVector