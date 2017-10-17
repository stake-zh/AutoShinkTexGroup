在开发中中我们可能遇到这样的需求：在一行文字中展示多项数据元素，不能元素有着不同的排列顺序，有的靠左，有的靠右，有的在某项数据的右侧，等等……
比如下图，在一行文字中显示**简介**、**年龄**和**职业**。
![pic1](http://obitym8vu.bkt.clouddn.com/screenshot-2017-10-17_21.18.15.985.png)
此时当我们**简介**内容很长时候，就会挤压**年龄**和**职业**显示，但是这些页面元素中，**职业**显示的等级最低，希望挤压  **简介**的显示，做到如下图显示
![pic2](http://obitym8vu.bkt.clouddn.com/screenshot-2017-10-17_21.18.50.611.png)
一般处理这种情况，我们可能要手动计算每一个textview的显示，然后用屏幕宽度减去每一个textview宽度，把剩余的空间留给**简介**的textview。

这里有有个简单的处理方式:通过weight和space来实现，很容易读懂，就不做代码分析。

```xml
<LinearLayout
        android:id="@+id/layout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_gravity="center_vertical"
            android:layout_weight="1"
            android:orientation="horizontal">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:gravity="center_vertical"
                android:orientation="horizontal">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="简介:" />

                <TextView
                    android:id="@+id/txt"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:ellipsize="end"
                    android:maxLines="1"
                    android:text="1234567890" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text=" 年龄：30" />

            </LinearLayout>

            <android.support.v4.widget.Space
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1" />
        </LinearLayout>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=" 职业:IT" />
    </LinearLayout>
```
demo 地址<https://github.com/stake-zh/AutoShrinkTexGroup>
