# SingleSelectableViewAdapter

Like standard ListView's item touch behaviour (only one selection allowed simultaneously when setOnItemClickListener is set).

Uses Haruki Hasegawa's [android-advancedrecyclerview](https://github.com/h6ah4i/android-advancedrecyclerview) 
[RecyclerViewAdapterUtils](https://github.com/h6ah4i/android-advancedrecyclerview/blob/master/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/utils/RecyclerViewAdapterUtils.java) class.

##How to use

Create listener

For example:

private final SingleSelectableViewTouchListener singleSelectableTouchListener = new SingleSelectableViewTouchListener();

and set it on views' OnTouchListeners:

viewItem.setOnTouchListener(singleSelectableTouchListener);

That's all)
