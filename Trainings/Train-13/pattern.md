Pattern : Decorator

Component : Skill
    operation() : use()
Decorator : Skill
    operation() : use() 
ConcreteComponent : FireSpell
    operation() : use()
ConcreteDecorator : PoisonDecorator, DoubleDamageDecorator
    operation() : use()