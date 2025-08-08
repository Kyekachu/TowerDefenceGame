internal class Hero {
    var hp: Int
        private set

    constructor() {
        hp = 100
    }

    constructor(hp: Int) {
        this.hp = hp
    }

    fun getDamage(damage: Int) {
        hp -= damage
    }

    fun attack(e: Enemy, attackStrength: Int) {
        e.getDamage(attackStrength)
    }
}