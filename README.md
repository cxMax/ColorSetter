# ColorSetter
a builder-design-pattern usage to set view textColor or backgroundcolor or backgrounddrawable


@Description： 构建一个简单build设计模式的链式调用, 来设置所有view的颜色, 就不用每次单独去setTextColor
 * usage: </br>
 new ColorSetter.Builder(getActivity())</br>
            .textColor(textView , color)</br>
            .backgroundColor(R.id.text , color)</br>
            .backgroundDrawable(R.id.text , color)</br>
            .create()</br>
            .setColor();
