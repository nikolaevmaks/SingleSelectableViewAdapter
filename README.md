# SingleSelectableViewAdapter

Like standard ListView's item touch behaviour (only one selection allowed simultaneously when setOnItemClickListener is set).

Uses Haruki Hasegawa's [android-advancedrecyclerview](https://github.com/h6ah4i/android-advancedrecyclerview) 
[RecyclerViewAdapterUtils](https://github.com/h6ah4i/android-advancedrecyclerview/blob/master/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/utils/RecyclerViewAdapterUtils.java) class.

##How to use

Simple inherit your RecyclerView adapter from SingleSelectableViewAdapter and
set SingleSelectableViewAdapter's OnTouchListener implementation as holder view's onTouchListener.

```java
private class ExtendedSingleSelectableViewAdapter extends SingleSelectableViewAdapter {

  ...
  
  class ViewHolder extends RecyclerView.ViewHolder {
    ViewHolder(View view) {
      view.setOnTouchListener(ExtendedSingleSelectableViewAdapter.this);
    }
  }
}
```

May be used with ListViews if we use item's onTouchListener instead of OnItemClickListener with small changes.
