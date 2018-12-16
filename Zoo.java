public class Zoo
{
    public static void main(String[] args)
    {
        Animal [] animals = new Animal[7];
        animals[0] = new Dog("Burek");
        animals[1] = new Dog("Azor");
        animals[2] = new Cat("Kicius");
        animals[3] = new Pig("Peppa");
        animals[4] = new Animal();
        animals[5] = new Cow("Buczus");
        animals[6] = new Ant("Z");

        for (Animal animal : animals)
        {
            animal.introduce();
        }

    }
}

class Animal
{
    String name;

    public Animal()
    {
        this.name = "bezimienny";
    }

    public String showName()
    {
        return "Zwierze " + name;
    }

    public String makeSound()
    {
        return "????";
    }

    public void introduce()
    {
        System.out.println("Jestem " + showName() + " " + makeSound());
    }
}

class Dog extends Animal
{
    public Dog(String name)
    {
        this.name = name;
    }

    @Override
    public String showName() {
        return "pies " + name;
    }

    @Override
    public String makeSound() {
        return "hau hau ";
    }
}

class Cat extends Animal
{
    public Cat(String name)
    {
        this.name = name;
    }

    @Override
    public String showName() {
        return "kot " + name;
    }

    @Override
    public String makeSound() {
        return "miau miau ";
    }
}

class Ant extends Animal
{
    public Ant(String name)
    {
        this.name = name;
    }

    @Override
    public String showName() {
        return "ant " + name;
    }

    @Override
    public String makeSound() {
        return "... ... ... ";
    }
}

class Cow extends Animal
{
    public Cow(String name)
    {
        this.name = name;
    }

    @Override
    public String showName() {
        return "Cow " + name;
    }

    @Override
    public String makeSound() {
        return "muuuuuuu !!! ";
    }
}

class Pig extends Animal
{
    Pig(String name) {
        this.name = name;

    }
}

