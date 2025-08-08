//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Enemy
import Tower

fun main() {
    val e1 = Enemy()
    val e2 = Enemy(500)
    val hero = Hero(1000)
    println("### enemy HPs before tower/hero attack ###")
    println("Enemy1: ${e1.hp}")
    println("Enemy2: ${e2.hp}")
    println("Hero: ${hero.hp}")
    val tower = Tower()
    tower.attack(e1, 10)
    println("### enemy HPs after tower/hero attack ###")
    println("Enemy1: ${e1.hp}")
    println("Enemy2: ${e2.hp}")
    println("Hero: ${hero.hp}")
}