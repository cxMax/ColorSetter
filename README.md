# ColorSetter
a builder-design-pattern usage to set view textColor or backgroundcolor or backgrounddrawable


@Description： 构建一个简单的链式调用, 来设置所有view的颜色, 就不用每次单独去setTextColor
 * usage: new ColorSetter.Builder(getActivity())
 *            .textColor(textView , color)
 *            .textColor(R.id.text , color)
 *            .create()
 *            .setColor();