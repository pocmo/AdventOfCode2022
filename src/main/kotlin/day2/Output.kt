package day2

sealed class Output(
    val value: Char,
) {
    // See the mighty type that is two in one.
    object X : Output('X')
    object Y : Output('Y')
    object Z : Output('Z')
}



