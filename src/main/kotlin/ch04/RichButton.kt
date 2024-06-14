package org.example.ch04

open class RichButton : Clickable {
    fun disable(){} // final. 하위 클래스가 이 메소드를 오버라이드 할 수 없음
    open fun animate() {} // 이 함수는 열려 있다. 하위 클래스가 이 메소드를 오버라이드 할 수 있음
    final override fun click() {} // 오버라이드한 메소드는 기본적으로 열려 있다.
}

abstract class Animated {
    abstract fun animate()
    open fun stopAnimation() {}
    fun animateTwice() {}
}