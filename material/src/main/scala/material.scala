/** material
  *
  * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
  */
package dev.laminar.material {

  import com.raquo.domtypes.generic.codecs._
  import com.raquo.laminar.api.L._
  import com.raquo.laminar.builders.HtmlTag
  import com.raquo.laminar.keys.{ReactiveHtmlAttr, ReactiveProp, ReactiveStyle}
  import com.raquo.laminar.nodes.ReactiveHtmlElement

  import org.scalajs.dom

  import scala.scalajs.js
  import scala.scalajs.js.annotation.JSImport

  object styles {
    import com.raquo.domtypes.generic.keys.Style

    /** The theme primary color.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
      */
    val themePrimary = new ReactiveStyle(new Style("--mdc-theme-primary", "--mdc-theme-primary"))

    /** The theme error color
      *
      * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
      */
    val themeError = new ReactiveStyle(new Style("--mdc-theme-error", "--mdc-theme-error"))

    /** The theme secondary color.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
      */
    val themeSecondary = new ReactiveStyle(new Style("--mdc-theme-secondary", "--mdc-theme-secondary"))

    /** The theme surface color.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
      */
    val themeSurface = new ReactiveStyle(new Style("--mdc-theme-surface", "--mdc-theme-surface"))

    /** The theme background color.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
      */
    val themeBackground = new ReactiveStyle(new Style("--mdc-theme-background", "--mdc-theme-background"))

    /** Text and icons on top of a theme primary color background.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
      */
    val themeOnPrimary = new ReactiveStyle(new Style("--mdc-theme-on-primary", "--mdc-theme-on-primary"))

    /** Text and icons on top of a theme secondary color background.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
      */
    val themeOnSecondary = new ReactiveStyle(new Style("--mdc-theme-on-secondary", "--mdc-theme-on-secondary"))

    /** Text and icons on top of a theme surface color background.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components">Component Collection Documentation</a>
      */
    val themeOnSurface = new ReactiveStyle(new Style("--mdc-theme-on-surface", "--mdc-theme-on-surface"))

  }

  /** mwc-button
    *
    * Buttons allow users to take actions, and make choices, with a single tap.
    *
    * {@literal @material/mwc-button@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
    */
  object Button {

    @js.native
    trait RawElement extends js.Object {

      /** Icon to display, and `aria-label` value when `label` is not defined.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def `icon`: String

      /** Label to display for the button, and `aria-label`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def `label`: String

      /** Creates a contained button that is elevated above the surface.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def `raised`: Boolean

      /** Creates a contained button that is flush with the surface.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def `unelevated`: Boolean

      /** Creates an outlined button that is flush with the surface.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def `outlined`: Boolean

      /** Makes the button text and container slightly smaller.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def `dense`: Boolean

      /** Disabled buttons cannot be interacted with and have no visual interaction effect.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def `disabled`: Boolean

      /** When `true`, `icon` will be displayed _after_ `label`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def `trailingIcon`: Boolean

    }

    @js.native
    @JSImport("@material/mwc-button", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Button.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-button", void = false)

    object slots {

      /** Default content to display between both icons and after label. NOTE: It is highly recommended to set the label property instead of projecting text as it will also set the aria-label
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

      /** Leading icon. Overrides icon property. Use label or the icon property to set the aria-label.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def icon(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "icon"))

      /** Icon to show after the label. Overrides trailingIcon property. Use label or the trailingIcon property to set the aria-label.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      def trailingIcon(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "trailingIcon"))

    }

    /** Icon to display, and `aria-label` value when `label` is not defined.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
      */
    val `icon` = new ReactiveProp("icon", StringAsIsCodec)

    /** Label to display for the button, and `aria-label`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
      */
    val `label` = new ReactiveProp("label", StringAsIsCodec)

    /** Creates a contained button that is elevated above the surface.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
      */
    val `raised` = new ReactiveProp("raised", BooleanAsIsCodec)

    /** Creates a contained button that is flush with the surface.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
      */
    val `unelevated` = new ReactiveProp("unelevated", BooleanAsIsCodec)

    /** Creates an outlined button that is flush with the surface.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
      */
    val `outlined` = new ReactiveProp("outlined", BooleanAsIsCodec)

    /** Makes the button text and container slightly smaller.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
      */
    val `dense` = new ReactiveProp("dense", BooleanAsIsCodec)

    /** Disabled buttons cannot be interacted with and have no visual interaction effect.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    /** When `true`, `icon` will be displayed _after_ `label`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
      */
    val `trailingIcon` = new ReactiveProp("trailingIcon", BooleanAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Left and right padding of the button label (for outlined buttons the outline width is automatically subtracted).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonHorizontalPadding = new ReactiveStyle(
        new Style("--mdc-button-horizontal-padding", "--mdc-button-horizontal-padding"),
      )

      /** `width` of the outline of an outlined button and attempts to keep the component size constant.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonOutlineWidth = new ReactiveStyle(new Style("--mdc-button-outline-width", "--mdc-button-outline-width"))

      /** Color of the outline of an outlined element.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonOutlineColor = new ReactiveStyle(new Style("--mdc-button-outline-color", "--mdc-button-outline-color"))

      /** Background fill color of a disabled raised or unelevated button.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonDisabledFillColor = new ReactiveStyle(
        new Style("--mdc-button-disabled-fill-color", "--mdc-button-disabled-fill-color"),
      )

      /** Text color of a disabled button as well as the outline color of a disabled outlined button.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonDisabledInkColor = new ReactiveStyle(
        new Style("--mdc-button-disabled-ink-color", "--mdc-button-disabled-ink-color"),
      )

      /** Sets the color of the outline of a disabled outlined button.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonDisabledOutlineColor = new ReactiveStyle(
        new Style("--mdc-button-disabled-outline-color", "--mdc-button-disabled-outline-color"),
      )

      /** Sets the box shadow of the raised button.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonRaisedBoxShadow = new ReactiveStyle(
        new Style("--mdc-button-raised-box-shadow", "--mdc-button-raised-box-shadow"),
      )

      /** Sets the box shadow of the raised button when focused or hovered.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonRaisedBoxShadowHover = new ReactiveStyle(
        new Style("--mdc-button-raised-box-shadow-hover", "--mdc-button-raised-box-shadow-hover"),
      )

      /** Sets the box shadow of the raised button when active.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonRaisedBoxShadowActive = new ReactiveStyle(
        new Style("--mdc-button-raised-box-shadow-active", "--mdc-button-raised-box-shadow-active"),
      )

      /** Sets the box shadow of the raised button when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/button">Component Documentation</a>
        */
      val buttonRaisedBoxShadowDisabled = new ReactiveStyle(
        new Style("--mdc-button-raised-box-shadow-disabled", "--mdc-button-raised-box-shadow-disabled"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Button)): _*)
    }

  }

  /** mwc-checkbox
    *
    * Checkboxes allow the user to select one or more items from a set. Checkboxes can be used to turn an option on or off.
    *
    * {@literal @material/mwc-checkbox@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
    */
  object Checkbox {

    @js.native
    trait RawElement extends js.Object {

      /** Whether the checkbox is checked.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
        */
      def `checked`: Boolean

      /** When a checkbox is the parent of a set of child checkboxes, the *indeterminate* state is used on the parent to indicate that some but not all of its children are checked.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
        */
      def `indeterminate`: Boolean

      /** When `true`, the checkbox cannot be interacted with, and renders in muted colors.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
        */
      def `disabled`: Boolean

      /** The value that will be included if the checkbox is submitted in a form.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
        */
      def `value`: String

      /** When `true`, the checkbox remove padding for touchscreens and increase density. Note, the checkbox will no longer meet accessibility guidelines for touch.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
        */
      def `reducedTouchTarget`: Boolean

    }

    @js.native
    @JSImport("@material/mwc-checkbox", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Checkbox.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-checkbox", void = false)

    object slots {}

    /** Whether the checkbox is checked.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
      */
    val `checked` = new ReactiveProp("checked", BooleanAsIsCodec)

    /** When a checkbox is the parent of a set of child checkboxes, the *indeterminate* state is used on the parent to indicate that some but not all of its children are checked.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
      */
    val `indeterminate` = new ReactiveProp("indeterminate", BooleanAsIsCodec)

    /** When `true`, the checkbox cannot be interacted with, and renders in muted colors.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    /** The value that will be included if the checkbox is submitted in a form.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
      */
    val `value` = new ReactiveProp("value", StringAsIsCodec)

    /** When `true`, the checkbox remove padding for touchscreens and increase density. Note, the checkbox will no longer meet accessibility guidelines for touch.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
      */
    val `reducedTouchTarget` = new ReactiveProp("reducedTouchTarget", BooleanAsIsCodec)

    /** Fired when the user modifies the checkbox checked or indeterminate states from an input device interaction. Note that, like native <input>, the change event is not fired when the checked or indeterminate properties are set from JavaScript.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
      */
    val onChange = new EventProp[dom.Event]("change")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Color of mark inside a `checked` or `indeterminate` checkbox (enabled or disabled).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
        */
      val checkboxInkColor = new ReactiveStyle(new Style("--mdc-checkbox-ink-color", "--mdc-checkbox-ink-color"))

      /** Color of the unchecked box.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
        */
      val checkboxUncheckedColor = new ReactiveStyle(
        new Style("--mdc-checkbox-unchecked-color", "--mdc-checkbox-unchecked-color"),
      )

      /** Color of the checkbox box and fill when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox">Component Documentation</a>
        */
      val checkboxDisabledColor = new ReactiveStyle(
        new Style("--mdc-checkbox-disabled-color", "--mdc-checkbox-disabled-color"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Checkbox)): _*)
    }

  }

  /** mwc-circular-progress
    *
    * Progress indicators express an unspecified wait time or display the length of a process.
    *
    * {@literal @material/mwc-circular-progress@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
    */
  object CircularProgress {

    @js.native
    trait RawElement extends js.Object {

      /** Sets the circular-progress into its indeterminate state.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
        */
      def `indeterminate`: Boolean

      /** Sets the progress bar's value. Value should be between [0, 1].
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
        */
      def `progress`: Double

      /** Sets the progress indicator's sizing based on density scale. Minimum value is `-8`. Each unit change in density scale corresponds to 4px change in side dimensions. The stroke width adjusts automatically.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
        */
      def `density`: Double

      /** Sets the progress indicator to the closed state. Sets content opacity to 0. Typically should be set to true when loading has finished.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
        */
      def `closed`: Boolean

      /** Sets CircularProgress.closed to false
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
        */
      def open(): Unit

      /** Sets CircularProgress.closed to true
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
        */
      def close(): Unit

    }

    @js.native
    @JSImport("@material/mwc-circular-progress", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = CircularProgress.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-circular-progress", void = false)

    object slots {}

    /** Sets the circular-progress into its indeterminate state.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
      */
    val `indeterminate` = new ReactiveProp("indeterminate", BooleanAsIsCodec)

    /** Sets the progress bar's value. Value should be between [0, 1].
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
      */
    val `progress` = new ReactiveProp("progress", DoubleAsIsCodec)

    /** Sets the progress indicator's sizing based on density scale. Minimum value is `-8`. Each unit change in density scale corresponds to 4px change in side dimensions. The stroke width adjusts automatically.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
      */
    val `density` = new ReactiveProp("density", DoubleAsIsCodec)

    /** Sets the progress indicator to the closed state. Sets content opacity to 0. Typically should be set to true when loading has finished.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress">Component Documentation</a>
      */
    val `closed` = new ReactiveProp("closed", BooleanAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(CircularProgress)): _*)
    }

  }

  /** mwc-circular-progress-four-color
    *
    * Progress indicators express an unspecified wait time or display the length of a process.
    *
    * {@literal @material/mwc-circular-progress-four-color@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
    */
  object CircularProgressFourColor {

    @js.native
    trait RawElement extends js.Object {

      /** Sets the circular-progress into its indeterminate state.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      def `indeterminate`: Boolean

      /** Sets the progress bar's value. Value should be between [0, 1].
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      def `progress`: Double

      /** Sets the progress indicator's sizing based on density scale. Minimum value is `-8`. Each unit change in density scale corresponds to 4px change in side dimensions. The stroke width adjusts automatically.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      def `density`: Double

      /** Sets the progress indicator to the closed state. Sets content opacity to 0. Typically should be set to true when loading has finished.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      def `closed`: Boolean

      /** Sets CircularProgress.closed to false
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      def open(): Unit

      /** Sets CircularProgress.closed to true
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      def close(): Unit

    }

    @js.native
    @JSImport("@material/mwc-circular-progress-four-color", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = CircularProgressFourColor.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-circular-progress-four-color", void = false)

    object slots {}

    /** Sets the circular-progress into its indeterminate state.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
      */
    val `indeterminate` = new ReactiveProp("indeterminate", BooleanAsIsCodec)

    /** Sets the progress bar's value. Value should be between [0, 1].
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
      */
    val `progress` = new ReactiveProp("progress", DoubleAsIsCodec)

    /** Sets the progress indicator's sizing based on density scale. Minimum value is `-8`. Each unit change in density scale corresponds to 4px change in side dimensions. The stroke width adjusts automatically.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
      */
    val `density` = new ReactiveProp("density", DoubleAsIsCodec)

    /** Sets the progress indicator to the closed state. Sets content opacity to 0. Typically should be set to true when loading has finished.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
      */
    val `closed` = new ReactiveProp("closed", BooleanAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Sets the first of the four rotating colors.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      val circularProgressBarColor1 = new ReactiveStyle(
        new Style("--mdc-circular-progress-bar-color-1", "--mdc-circular-progress-bar-color-1"),
      )

      /** Sets the second of the four rotating colors.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      val circularProgressBarColor2 = new ReactiveStyle(
        new Style("--mdc-circular-progress-bar-color-2", "--mdc-circular-progress-bar-color-2"),
      )

      /** Sets the third of the four rotating colors.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      val circularProgressBarColor3 = new ReactiveStyle(
        new Style("--mdc-circular-progress-bar-color-3", "--mdc-circular-progress-bar-color-3"),
      )

      /** Sets the last of the four rotating colors.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color">Component Documentation</a>
        */
      val circularProgressBarColor4 = new ReactiveStyle(
        new Style("--mdc-circular-progress-bar-color-4", "--mdc-circular-progress-bar-color-4"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(CircularProgressFourColor)): _*)
    }

  }

  /** mwc-dialog
    *
    * Dialogs inform users about a task and can contain critical information, require decisions, or involve multiple tasks.
    *
    * {@literal @material/mwc-dialog@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
    */
  object Dialog {

    @js.native
    trait RawElement extends js.Object {

      /** Whether the dialog should open.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `open`: Boolean

      /** Hides the actions footer of the dialog. Needed to remove excess padding when no actions are slotted in.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `hideActions`: Boolean

      /** Whether to stack the action buttons.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `stacked`: Boolean

      /** Heading text of the dialog.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `heading`: String

      /** _Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when the dialog closes because the scrim was clicked (see [actions section](#actions)).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `scrimClickAction`: String

      /** _Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when the dialog closes because the excape key was pressed (see [actions section](#actions)).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `escapeKeyAction`: String

      /** _Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when `<mwc-dialog>.open` is toggled (see [actions section](#actions)).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `defaultAction`: String

      /** _Default: 'dialogAction'_ – Attribute to read in light dom of dialog for closing action value (see [actions section](#actions)).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `actionAttribute`: String

      /** _Default: 'dialogInitialFocus'_ – Attribute to search for in light dom for initial focus on dialog open.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def `initialFocusAttribute`: String

      /** Forces dialog to relayout (animation frame time). May be required if dialog size is incorrect or if stacked layout has not been triggered correctly.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def forceLayout(): Unit

      /** Focuses on the initial focus element if defined (see [focus section](#focus)).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def focus(): Unit

      /** Blurs the active element.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def blur(): Unit

      /** Opens the dialog.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def show(): Unit

      /** Closes the dialog.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def close(): Unit

    }

    @js.native
    @JSImport("@material/mwc-dialog", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Dialog.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-dialog", void = false)

    object slots {

      /** Content to display in the dialog's content area.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

      /** A focusable and clickable target. Typically a button such as <mwc-button>. Placed on the bottom right of the dialog (LTR) and above the secondary action when stacked. Automatically clicked when Enter key is pressed in the dialog.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def primaryAction(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "primaryAction"))

      /** A focusable and clickable target. Typically a button such as <mwc-button>. Placed immediately to the left of the primaryAction (LTR) or below when stacked.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      def secondaryAction(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "secondaryAction"))

    }

    /** Whether the dialog should open.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `open` = new ReactiveProp("open", BooleanAsIsCodec)

    /** Hides the actions footer of the dialog. Needed to remove excess padding when no actions are slotted in.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `hideActions` = new ReactiveProp("hideActions", BooleanAsIsCodec)

    /** Whether to stack the action buttons.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `stacked` = new ReactiveProp("stacked", BooleanAsIsCodec)

    /** Heading text of the dialog.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `heading` = new ReactiveProp("heading", StringAsIsCodec)

    /** _Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when the dialog closes because the scrim was clicked (see [actions section](#actions)).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `scrimClickAction` = new ReactiveProp("scrimClickAction", StringAsIsCodec)

    /** _Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when the dialog closes because the excape key was pressed (see [actions section](#actions)).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `escapeKeyAction` = new ReactiveProp("escapeKeyAction", StringAsIsCodec)

    /** _Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when `<mwc-dialog>.open` is toggled (see [actions section](#actions)).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `defaultAction` = new ReactiveProp("defaultAction", StringAsIsCodec)

    /** _Default: 'dialogAction'_ – Attribute to read in light dom of dialog for closing action value (see [actions section](#actions)).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `actionAttribute` = new ReactiveProp("actionAttribute", StringAsIsCodec)

    /** _Default: 'dialogInitialFocus'_ – Attribute to search for in light dom for initial focus on dialog open.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val `initialFocusAttribute` = new ReactiveProp("initialFocusAttribute", StringAsIsCodec)

    /** Fired when the dialog is beginning to open.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val onOpening = new EventProp[dom.Event]("opening")

    /** Fired once the dialog is finished opening (after animation).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val onOpened = new EventProp[dom.Event]("opened")

    /** Fired when the dialog is is beginning to close. Detail is the action that closed the dialog (see [actions section](#actions)).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val onClosing = new EventProp[dom.Event]("closing")

    /** Fired once the dialog is finished closing (after animation). Detail is the action that closed the dialog (see [actions section](#actions))
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
      */
    val onClosed = new EventProp[dom.Event]("closed")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Corner radius of the dialog surface.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val shapeMedium = new ReactiveStyle(new Style("--mdc-shape-medium", "--mdc-shape-medium"))

      /** Color of the scrim. (**Note:** setting alpha to 0 will still make scrim clickable but transparent).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val dialogScrimColor = new ReactiveStyle(new Style("--mdc-dialog-scrim-color", "--mdc-dialog-scrim-color"))

      /** Color of the heading text.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val dialogHeadingInkColor = new ReactiveStyle(
        new Style("--mdc-dialog-heading-ink-color", "--mdc-dialog-heading-ink-color"),
      )

      /** Color applied to the projected content. (**Note:** it may also be possible to style the content via the light DOM since it is not encapsulated in a shadow root).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val dialogContentInkColor = new ReactiveStyle(
        new Style("--mdc-dialog-content-ink-color", "--mdc-dialog-content-ink-color"),
      )

      /** Color of the dividers present when dialog is scrollable.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val dialogScrollDividerColor = new ReactiveStyle(
        new Style("--mdc-dialog-scroll-divider-color", "--mdc-dialog-scroll-divider-color"),
      )

      /** min-width ofthe dialog surface.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val dialogMinWidth = new ReactiveStyle(new Style("--mdc-dialog-min-width", "--mdc-dialog-min-width"))

      /** max-width of the dialog surface. (**Note:** if max-width is < `560px`, there is a visual jank bug that will occur causing the max width to be `560px` when the window is sized to <= than `560px`).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val dialogMaxWidth = new ReactiveStyle(new Style("--mdc-dialog-max-width", "--mdc-dialog-max-width"))

      /** Max height of the dialog surface.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val dialogMaxHeight = new ReactiveStyle(new Style("--mdc-dialog-max-height", "--mdc-dialog-max-height"))

      /** Sets the box shadow of the dialog.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/dialog">Component Documentation</a>
        */
      val dialogBoxShadow = new ReactiveStyle(new Style("--mdc-dialog-box-shadow", "--mdc-dialog-box-shadow"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Dialog)): _*)
    }

  }

  /** mwc-drawer
    *
    * The Navigation Drawer is used to organize access to destinations and other functionality on an app.
    *
    * {@literal @material/mwc-drawer@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
    */
  object Drawer {

    @js.native
    trait RawElement extends js.Object {

      /** Whether the dialog is open
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      def `open`: Boolean

      /** When `true`, displays the `title`, `subtitle`, and `header` slots.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      def `hasHeader`: Boolean

      /** When set to `'dismissible'`, overlays the drawer on the content. When set to `'modal'`, also adds a scrim when the drawer is open. When set to empty string, it is inlined with the page and displaces app content.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      def `type`: String

    }

    @js.native
    @JSImport("@material/mwc-drawer", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Drawer.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-drawer", void = false)

    object slots {

      /** Elements to display under the header in drawer.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

      /** Header title to display in the drawer when `hasHeader` is true.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      def title(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "title"))

      /** Header subtitle to display in the drawer when `hasHeader` is true.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      def subtitle(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "subtitle"))

      /** Additional header elements to display in the drawer.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      def header(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "header"))

      /** Elements to display in the 'app content' to the right of, or under, the drawer.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      def appContent(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "appContent"))

    }

    /** Whether the dialog is open
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
      */
    val `open` = new ReactiveProp("open", BooleanAsIsCodec)

    /** When `true`, displays the `title`, `subtitle`, and `header` slots.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
      */
    val `hasHeader` = new ReactiveProp("hasHeader", BooleanAsIsCodec)

    /** When set to `'dismissible'`, overlays the drawer on the content. When set to `'modal'`, also adds a scrim when the drawer is open. When set to empty string, it is inlined with the page and displaces app content.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
      */
    val `type` = new ReactiveProp("type", StringAsIsCodec)

    /** Fired when the drawer opens.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
      */
    val onOpened = new EventProp[dom.Event]("MDCDrawer:opened")

    /** Fired when the drawer closes.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
      */
    val onClosed = new EventProp[dom.Event]("MDCDrawer:closed")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Width of the side drawer when opened.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/drawer">Component Documentation</a>
        */
      val drawerWidth = new ReactiveStyle(new Style("--mdc-drawer-width", "--mdc-drawer-width"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Drawer)): _*)
    }

  }

  /** mwc-fab
    *
    * A floating action button (FAB) represents the primary action of a screen.
    *
    * {@literal @material/mwc-fab@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
    */
  object Fab {

    @js.native
    trait RawElement extends js.Object {

      /** The icon to display.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      def `icon`: String

      /** The label to display when using the `extended` layout, and the `aria-label` attribute in all layouts.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      def `label`: String

      /** Modifies the FAB to be a smaller size, for use on smaller screens. Defaults to `false`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      def `mini`: Boolean

      /** Sets the minimum touch target of the default-sized mini fab to recommended 48x48px.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      def `reducedTouchTarget`: Boolean

      /** Enable the *extended* layout which includes a text label. Defaults to `false`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      def `extended`: Boolean

      /** When in the *extended* layout, position the icon after the label, instead of before. Defaults to `false`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      def `showIconAtEnd`: Boolean

    }

    @js.native
    @JSImport("@material/mwc-fab", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Fab.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-fab", void = false)

    object slots {

      /** An icon to be slotted into the fab. Note: the label property should still be set for button accessibility.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      def icon(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "icon"))

    }

    /** The icon to display.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
      */
    val `icon` = new ReactiveProp("icon", StringAsIsCodec)

    /** The label to display when using the `extended` layout, and the `aria-label` attribute in all layouts.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
      */
    val `label` = new ReactiveProp("label", StringAsIsCodec)

    /** Modifies the FAB to be a smaller size, for use on smaller screens. Defaults to `false`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
      */
    val `mini` = new ReactiveProp("mini", BooleanAsIsCodec)

    /** Sets the minimum touch target of the default-sized mini fab to recommended 48x48px.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
      */
    val `reducedTouchTarget` = new ReactiveProp("reducedTouchTarget", BooleanAsIsCodec)

    /** Enable the *extended* layout which includes a text label. Defaults to `false`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
      */
    val `extended` = new ReactiveProp("extended", BooleanAsIsCodec)

    /** When in the *extended* layout, position the icon after the label, instead of before. Defaults to `false`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
      */
    val `showIconAtEnd` = new ReactiveProp("showIconAtEnd", BooleanAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Font to use for the icon.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      val iconFont = new ReactiveStyle(new Style("--mdc-icon-font", "--mdc-icon-font"))

      /** Foreground color of the label and icon.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      val themeOnSecondary = new ReactiveStyle(new Style("--mdc-theme-on-secondary", "--mdc-theme-on-secondary"))

      /** Background color of the FAB.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      val themeSecondary = new ReactiveStyle(new Style("--mdc-theme-secondary", "--mdc-theme-secondary"))

      /** Sets the box shadow of the fab. Elevation 6 when idle, 8 when focused or hovered, and 12 when active.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/fab">Component Documentation</a>
        */
      val fabBoxShadow = new ReactiveStyle(new Style("--mdc-fab-box-shadow", "--mdc-fab-box-shadow"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Fab)): _*)
    }

  }

  /** mwc-formfield
    *
    * A form field is a text caption for MWC input elements including <mwc-checkbox>, <mwc-radio>, and <mwc-switch>. It is equivalent to the native <label> element in that it forwards user interaction events to the input element. For example, tapping on the label causes the associated input element to toggle and focus.
    *
    * {@literal @material/mwc-formfield@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
    */
  object Formfield {

    @js.native
    trait RawElement extends js.Object {

      /** The text to display for the label and sets a11y label on input. (visually overriden by slotted label)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
        */
      def `label`: String

      /** Align the component at the end of the label.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
        */
      def `alignEnd`: Boolean

      /** Add space between the component and the label as the formfield grows.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
        */
      def `spaceBetween`: Boolean

      /** Prevents the label from wrapping and overflow text is ellipsed.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
        */
      def `nowrap`: Boolean

    }

    @js.native
    @JSImport("@material/mwc-formfield", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Formfield.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-formfield", void = false)

    object slots {

      /** The input element that this form field provides a label for.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

    }

    /** The text to display for the label and sets a11y label on input. (visually overriden by slotted label)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
      */
    val `label` = new ReactiveProp("label", StringAsIsCodec)

    /** Align the component at the end of the label.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
      */
    val `alignEnd` = new ReactiveProp("alignEnd", BooleanAsIsCodec)

    /** Add space between the component and the label as the formfield grows.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
      */
    val `spaceBetween` = new ReactiveProp("spaceBetween", BooleanAsIsCodec)

    /** Prevents the label from wrapping and overflow text is ellipsed.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/formfield">Component Documentation</a>
      */
    val `nowrap` = new ReactiveProp("nowrap", BooleanAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Formfield)): _*)
    }

  }

  /** mwc-icon-button-toggle
    *
    * Toggle buttons can be used to group related options. To emphasize groups of related toggle buttons, a group should share a common container.
    *
    * {@literal @material/mwc-icon-button-toggle@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
    */
  object IconButtonToggle {

    @js.native
    trait RawElement extends js.Object {

      /** Whether the toggle is activated.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      def `on`: Boolean

      /** Icon to display when `on` is `true`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      def `onIcon`: String

      /** Icon to display when `on` is `false`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      def `offIcon`: String

      /** Accessible label for the button, sets `aria-label`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      def `label`: String

      /** Disabled buttons cannot be interacted with and have no visual interaction effect.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      def `disabled`: Boolean

    }

    @js.native
    @JSImport("@material/mwc-icon-button-toggle", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = IconButtonToggle.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-icon-button-toggle", void = false)

    object slots {

      /** Optional <img> or <svg> to display instead of using an icon font for the onIcon property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      def onIcon(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "onIcon"))

      /** Optional <img> or <svg> to display instead of using an icon font for the offIcon property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      def offIcon(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "offIcon"))

    }

    /** Whether the toggle is activated.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
      */
    val `on` = new ReactiveProp("on", BooleanAsIsCodec)

    /** Icon to display when `on` is `true`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
      */
    val `onIcon` = new ReactiveProp("onIcon", StringAsIsCodec)

    /** Icon to display when `on` is `false`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
      */
    val `offIcon` = new ReactiveProp("offIcon", StringAsIsCodec)

    /** Accessible label for the button, sets `aria-label`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
      */
    val `label` = new ReactiveProp("label", StringAsIsCodec)

    /** Disabled buttons cannot be interacted with and have no visual interaction effect.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    /** Indicates the button has toggled. isOn indicates the on value of the toggle button.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
      */
    val onChange = new EventProp[dom.Event]("MDCIconButtonToggle:change")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Font that supports *ligatures* and determines which icons are available (see [fonts](#fonts) above).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      val iconFont = new ReactiveStyle(new Style("--mdc-icon-font", "--mdc-icon-font"))

      /** Color of icon when `disabled` is `true`
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      val themeTextDisabledOnLight = new ReactiveStyle(
        new Style("--mdc-theme-text-disabled-on-light", "--mdc-theme-text-disabled-on-light"),
      )

      /** Opacity of the ripple on the icon button
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle">Component Documentation</a>
        */
      val iconButtonRippleOpacity = new ReactiveStyle(
        new Style("--mdc-icon-button-ripple-opacity", "--mdc-icon-button-ripple-opacity"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(IconButtonToggle)): _*)
    }

  }

  /** mwc-icon-button
    *
    * Icon buttons allow users to take actions, and make choices, with a single tap.
    *
    * {@literal @material/mwc-icon-button@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
    */
  object IconButton {

    @js.native
    trait RawElement extends js.Object {

      /** Icon to display, and `aria-label` value when `label` is not defined.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      def `icon`: String

      /** Accessible label for the button, sets `aria-label`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      def `label`: String

      /** Disabled buttons cannot be interacted with and have no visual interaction effect.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      def `disabled`: Boolean

    }

    @js.native
    @JSImport("@material/mwc-icon-button", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = IconButton.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-icon-button", void = false)

    object slots {

      /** Optional <img> or <svg> to display instead of using an icon font
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

    }

    /** Icon to display, and `aria-label` value when `label` is not defined.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
      */
    val `icon` = new ReactiveProp("icon", StringAsIsCodec)

    /** Accessible label for the button, sets `aria-label`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
      */
    val `label` = new ReactiveProp("label", StringAsIsCodec)

    /** Disabled buttons cannot be interacted with and have no visual interaction effect.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Font that supports *ligatures* and determines which icons are available (see [fonts](#fonts) above).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      val iconFont = new ReactiveStyle(new Style("--mdc-icon-font", "--mdc-icon-font"))

      /** Sets the size of the button wrapping the icon.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      val iconButtonSize = new ReactiveStyle(new Style("--mdc-icon-button-size", "--mdc-icon-button-size"))

      /** Sets the size of the icon.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      val iconSize = new ReactiveStyle(new Style("--mdc-icon-size", "--mdc-icon-size"))

      /** Color of icon when `disabled` is `true`
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      val themeTextDisabledOnLight = new ReactiveStyle(
        new Style("--mdc-theme-text-disabled-on-light", "--mdc-theme-text-disabled-on-light"),
      )

      /** Opacity of the ripple on the icon button
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button">Component Documentation</a>
        */
      val iconButtonRippleOpacity = new ReactiveStyle(
        new Style("--mdc-icon-button-ripple-opacity", "--mdc-icon-button-ripple-opacity"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(IconButton)): _*)
    }

  }

  /** mwc-icon
    *
    * Icon displays an icon with a chosen name from the [Material Icons](https://material.io/resources/icons/) font, or from any font that supports *ligatures*.
    *
    * {@literal @material/mwc-icon@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon">Component Documentation</a>
    */
  object Icon {

    @js.native
    trait RawElement extends js.Object {}

    @js.native
    @JSImport("@material/mwc-icon", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Icon.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-icon", void = false)

    object slots {

      /** The name of the icon to display (e.g. shopping_cart). See Material Icons for an index of all available icons.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

    }

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Font that supports ligatures and determines which icons are available (see fonts above).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon">Component Documentation</a>
        */
      val iconFont = new ReactiveStyle(new Style("--mdc-icon-font", "--mdc-icon-font"))

      /** Size of the icon.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/icon">Component Documentation</a>
        */
      val iconSize = new ReactiveStyle(new Style("--mdc-icon-size", "--mdc-icon-size"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Icon)): _*)
    }

  }

  /** mwc-linear-progress
    *
    * Progress indicators express an unspecified wait time or display the length of a process.
    *
    * {@literal @material/mwc-linear-progress@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
    */
  object LinearProgress {

    @js.native
    trait RawElement extends js.Object {

      /** Sets the linear-progress into its indeterminate state.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      def `indeterminate`: Boolean

      /** Sets the primary progress bar's value. Value should be between [0, 1].
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      def `progress`: Double

      /** Sets the buffer progress bar's value. Value should be between [0, 1]. Setting this value to be less than 1 will reveal moving, buffering dots.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      def `buffer`: Double

      /** Reverses the direction of the linear progress indicator.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      def `reverse`: Boolean

      /** Sets the progress indicator to the closed state. Sets content opactiy to 0. Typically should be set to true when loading has finished.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      def `closed`: Boolean

      /** Sets LinearProgress.closed to false
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      def open(): Unit

      /** Sets LinearProgress.closed to true
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      def close(): Unit

    }

    @js.native
    @JSImport("@material/mwc-linear-progress", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = LinearProgress.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-linear-progress", void = false)

    object slots {}

    /** Sets the linear-progress into its indeterminate state.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
      */
    val `indeterminate` = new ReactiveProp("indeterminate", BooleanAsIsCodec)

    /** Sets the primary progress bar's value. Value should be between [0, 1].
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
      */
    val `progress` = new ReactiveProp("progress", DoubleAsIsCodec)

    /** Sets the buffer progress bar's value. Value should be between [0, 1]. Setting this value to be less than 1 will reveal moving, buffering dots.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
      */
    val `buffer` = new ReactiveProp("buffer", DoubleAsIsCodec)

    /** Reverses the direction of the linear progress indicator.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
      */
    val `reverse` = new ReactiveProp("reverse", BooleanAsIsCodec)

    /** Sets the progress indicator to the closed state. Sets content opactiy to 0. Typically should be set to true when loading has finished.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
      */
    val `closed` = new ReactiveProp("closed", BooleanAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Sets the color of primary progress bar.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      val themePrimary = new ReactiveStyle(new Style("--mdc-theme-primary", "--mdc-theme-primary"))

      /** Sets the color of the buffer progress bar.<br> **NOTE:** to change the color of the buffering dots, you must do so in the image of `--mdc-linear-progress-buffering-dots-image`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      val linearProgressBufferColor = new ReactiveStyle(
        new Style("--mdc-linear-progress-buffer-color", "--mdc-linear-progress-buffer-color"),
      )

      /** Sets the image to use as the buffering dots. This pattern is then repeated horizontally and animated.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress">Component Documentation</a>
        */
      val linearProgressBufferingDotsImage = new ReactiveStyle(
        new Style("--mdc-linear-progress-buffering-dots-image", "--mdc-linear-progress-buffering-dots-image"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(LinearProgress)): _*)
    }

  }

  /** mwc-radio
    *
    * Radio buttons allow the user to select one option from a set. Use radio buttons when the user needs to see all available options.
    *
    * {@literal @material/mwc-radio@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
    */
  object Radio {

    @js.native
    trait RawElement extends js.Object {

      /** Whether this radio button is the currently-selected one in its group. Maps to the native [`checked`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio#checked) attribute.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
        */
      def `checked`: Boolean

      /** If `true`, this radio button cannot be selected or de-selected. Maps to the native [`disabled`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#disabled) attribute.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
        */
      def `disabled`: Boolean

      /** Name of the input for form submission, and identifier for the selection group. Only one radio button can be checked for a given selection group. Maps to the native [`name`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#name) attribute.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
        */
      def `name`: String

      /** Value of the input for form submission. Maps to the native [`value`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio#value) attribute.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
        */
      def `value`: String

      /** If `true`, this radio button will use a global, document-level scope for its selection group rather than its local shadow root.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
        */
      def `global`: Boolean

    }

    @js.native
    @JSImport("@material/mwc-radio", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Radio.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-radio", void = false)

    object slots {}

    /** Whether this radio button is the currently-selected one in its group. Maps to the native [`checked`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio#checked) attribute.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
      */
    val `checked` = new ReactiveProp("checked", BooleanAsIsCodec)

    /** If `true`, this radio button cannot be selected or de-selected. Maps to the native [`disabled`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#disabled) attribute.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    /** Name of the input for form submission, and identifier for the selection group. Only one radio button can be checked for a given selection group. Maps to the native [`name`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#name) attribute.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
      */
    val `name` = new ReactiveProp("name", StringAsIsCodec)

    /** Value of the input for form submission. Maps to the native [`value`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio#value) attribute.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
      */
    val `value` = new ReactiveProp("value", StringAsIsCodec)

    /** If `true`, this radio button will use a global, document-level scope for its selection group rather than its local shadow root.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
      */
    val `global` = new ReactiveProp("global", BooleanAsIsCodec)

    /** Fired when the user modifies the radio checked state from an input device interaction on this radio. Note that, like native <input>, the change event is not fired when the checked property is set from JavaScript, nor is it fired when another radio in the same group becomes checked.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
      */
    val onChange = new EventProp[dom.Event]("change")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Color of the ring of an unchecked radio.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
        */
      val radioUncheckedColor = new ReactiveStyle(
        new Style("--mdc-radio-unchecked-color", "--mdc-radio-unchecked-color"),
      )

      /** Color of the ring and circle of a disabled radio.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/radio">Component Documentation</a>
        */
      val radioDisabledColor = new ReactiveStyle(new Style("--mdc-radio-disabled-color", "--mdc-radio-disabled-color"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Radio)): _*)
    }

  }

  /** mwc-slider
    *
    * Sliders allow users to make selections from a range of values.
    *
    * {@literal @material/mwc-slider@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
    */
  object Slider {

    @js.native
    trait RawElement extends js.Object {

      /** Current value of the slider.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      def `value`: Double

      /** Minimum value of the slider.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      def `min`: Double

      /** Maximum value of the slider.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      def `max`: Double

      /** When defined, the slider will quantize (round to the nearest multiple) all values to match that step value, except for the minimum and maximum values, which can always be set. When 0, quantization is disabled.<br> **NOTE:** Throws when <0.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      def `step`: Double

      /** Shows the thumb pin on a discrete slider.<br> **NOTE:** Numbers displayed inside the slider will be rounded to at most 3 decimal digits.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      def `pin`: Boolean

      /** Shows the tick marks for each step on the track when the slider is discrete.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      def `markers`: Boolean

      /** Recomputes the dimensions and re-lays out the component. This should be called if the dimensions of the slider itself or any of its parent elements change programmatically (it is called automatically on resize and on mousedown / touchstart).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      def layout(): Unit

    }

    @js.native
    @JSImport("@material/mwc-slider", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Slider.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-slider", void = false)

    object slots {}

    /** Current value of the slider.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
      */
    val `value` = new ReactiveProp("value", DoubleAsIsCodec)

    /** Minimum value of the slider.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
      */
    val `min` = new ReactiveProp("min", DoubleAsIsCodec)

    /** Maximum value of the slider.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
      */
    val `max` = new ReactiveProp("max", DoubleAsIsCodec)

    /** When defined, the slider will quantize (round to the nearest multiple) all values to match that step value, except for the minimum and maximum values, which can always be set. When 0, quantization is disabled.<br> **NOTE:** Throws when <0.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
      */
    val `step` = new ReactiveProp("step", DoubleAsIsCodec)

    /** Shows the thumb pin on a discrete slider.<br> **NOTE:** Numbers displayed inside the slider will be rounded to at most 3 decimal digits.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
      */
    val `pin` = new ReactiveProp("pin", BooleanAsIsCodec)

    /** Shows the tick marks for each step on the track when the slider is discrete.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
      */
    val `markers` = new ReactiveProp("markers", BooleanAsIsCodec)

    /** Fired when the value changes due to user input. Similar to the input event of the native <input type="range"> element, the input event will not fire when value is modified via JavaScript.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
      */
    val onInput = new EventProp[dom.Event]("input")

    /** Fired when the value changes and the user has finished interacting with the slider. Similar to the change event of the native <input type="range"> element, the change event will not fire when value is modified via JavaScript.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
      */
    val onChange = new EventProp[dom.Event]("change")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Sets the color of the knob and filled track when slider is active.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      val themeSecondary = new ReactiveStyle(new Style("--mdc-theme-secondary", "--mdc-theme-secondary"))

      /** Sets the color of the text in the pin.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      val themeTextPrimaryOnDark = new ReactiveStyle(
        new Style("--mdc-theme-text-primary-on-dark", "--mdc-theme-text-primary-on-dark"),
      )

      /** Sets the color of the circle around the knob on the disabled slider to make it seem cut-out. May be necessary when placing a disabled slider on a different-colored background.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/slider">Component Documentation</a>
        */
      val sliderBgColorBehindComponent = new ReactiveStyle(
        new Style("--mdc-slider-bg-color-behind-component", "--mdc-slider-bg-color-behind-component"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Slider)): _*)
    }

  }

  /** mwc-snackbar
    *
    * Snackbars provide brief messages about app processes at the bottom of the screen.
    *
    * {@literal @material/mwc-snackbar@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
    */
  object Snackbar {

    @js.native
    trait RawElement extends js.Object {

      /** Whether the snackbar is currently open.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def `open`: Boolean

      /** Automatic dismiss timeout in milliseconds. Value must be between `4000` and `10000`  (or `-1` to disable the timeout completely) or an error will be thrown. Defaults to `5000` (5 seconds).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def `timeoutMs`: Double

      /** Whether the snackbar closes when it is focused and the user presses the ESC key. Defaults to `true`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def `closeOnEscape`: Boolean

      /** The text content of the label element.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def `labelText`: String

      /** Enables the *stacked* layout (see above).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def `stacked`: Boolean

      /** Enables the *leading* layout (see above).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def `leading`: Boolean

      /** Opens the snackbar.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def show(): Unit

      /** Closes the snackbar, optionally with the specified reason indicating why it was closed.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def close(): Unit

    }

    @js.native
    @JSImport("@material/mwc-snackbar", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Snackbar.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-snackbar", void = false)

    object slots {

      /** Optional <mwc-button> which closes the snackbar with reason 'action'.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def action(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "action"))

      /** Optional <mwc-icon-button> which closes the snackbar with reason 'dismiss'.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      def dismiss(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "dismiss"))

    }

    /** Whether the snackbar is currently open.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val `open` = new ReactiveProp("open", BooleanAsIsCodec)

    /** Automatic dismiss timeout in milliseconds. Value must be between `4000` and `10000`  (or `-1` to disable the timeout completely) or an error will be thrown. Defaults to `5000` (5 seconds).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val `timeoutMs` = new ReactiveProp("timeoutMs", DoubleAsIsCodec)

    /** Whether the snackbar closes when it is focused and the user presses the ESC key. Defaults to `true`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val `closeOnEscape` = new ReactiveProp("closeOnEscape", BooleanAsIsCodec)

    /** The text content of the label element.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val `labelText` = new ReactiveProp("labelText", StringAsIsCodec)

    /** Enables the *stacked* layout (see above).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val `stacked` = new ReactiveProp("stacked", BooleanAsIsCodec)

    /** Enables the *leading* layout (see above).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val `leading` = new ReactiveProp("leading", BooleanAsIsCodec)

    /** Indicates when the snackbar begins its opening animation.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val onOpening = new EventProp[dom.Event]("MDCSnackbar:opening")

    /** Indicates when the snackbar finishes its opening animation.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val onOpened = new EventProp[dom.Event]("MDCSnackbar:opened")

    /** Indicates when the snackbar begins its closing animation. reason contains the reason why the snackbar closed ('dismiss', 'action', or a custom string via the close method).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val onClosing = new EventProp[dom.Event]("MDCSnackbar:closing")

    /** Indicates when the snackbar finishes its closing animation. reason contains the reason why the snackbar closed ('dismiss', 'action', or a custom string via the close method).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
      */
    val onClosed = new EventProp[dom.Event]("MDCSnackbar:closed")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Color of the action button text.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar">Component Documentation</a>
        */
      val snackbarActionColor = new ReactiveStyle(
        new Style("--mdc-snackbar-action-color", "--mdc-snackbar-action-color"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Snackbar)): _*)
    }

  }

  /** mwc-switch
    *
    * Switches toggle the state of a single setting on or off. They are the preferred way to adjust settings on mobile.
    *
    * {@literal @material/mwc-switch@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/switch">Component Documentation</a>
    */
  object Switch {

    @js.native
    trait RawElement extends js.Object {

      /** Whether or not the switch should be checked / activated.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/switch">Component Documentation</a>
        */
      def `checked`: Boolean

      /** Disables the input and sets the disabled styles.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/switch">Component Documentation</a>
        */
      def `disabled`: Boolean

    }

    @js.native
    @JSImport("@material/mwc-switch", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Switch.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-switch", void = false)

    object slots {}

    /** Whether or not the switch should be checked / activated.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/switch">Component Documentation</a>
      */
    val `checked` = new ReactiveProp("checked", BooleanAsIsCodec)

    /** Disables the input and sets the disabled styles.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/switch">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    /** Fired when the user modifies the switch checked state from an input device interaction. Note that, like native <input>, the change event is not fired when the checked property is set from JavaScript.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/switch">Component Documentation</a>
      */
    val onChange = new EventProp[dom.Event]("change")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Switch)): _*)
    }

  }

  /** mwc-tab-bar
    *
    * Tabs organize content across different screens, data sets, and other interactions.
    *
    * {@literal @material/mwc-tab-bar@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
    */
  object TabBar {

    @js.native
    trait RawElement extends js.Object {

      /** Index of tab that is active.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `activeIndex`: Double

      /** For long, scrollable tab-bars, scrolls the tab at the given index into view.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def scrollIndexIntoView(): Unit

    }

    @js.native
    @JSImport("@material/mwc-tab-bar", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = TabBar.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-tab-bar", void = false)

    object slots {

      /** mwc-tab elements to display.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

    }

    /** Index of tab that is active.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val `activeIndex` = new ReactiveProp("activeIndex", DoubleAsIsCodec)

    /** Emitted when a tab selection has been made.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val onActivated = new EventProp[dom.Event]("MDCTabBar:activated")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(TabBar)): _*)
    }

    /** mwc-tab
      *
      * Tabs organize content across different screens, data sets, and other interactions.
      *
      * {@literal @material/mwc-tab@0.18.0}
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
      */
    object Tab {

      @js.native
      trait RawElement extends js.Object {

        /** Text label to display in tab.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `label`: String

        /** Material design icon name to display (overridden by slotted icon).
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `icon`: String

        /** Displays a slot to show an image icon.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `hasImageIcon`: Boolean

        /** Material design icon name to display as the indicator.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `indicatorIcon`: String

        /** Indicator fades in and out instead of sliding.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `isFadingIndicator`: Boolean

        /** Shrinks tab as narrow as possible without causing text to wrap.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `minWidth`: Boolean

        /** Shrinks indicator to be the size of the content.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `isMinWidthIndicator`: Boolean

        /** Stacks icon on top of label text.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `stacked`: Boolean

        /** Indicates whether the tab's indicator is active.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def `active`: Any

        /** Activates the indicator.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def activate(): Unit

        /** Deactivates the indicator.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def deactivate(): Unit

        /** Computes the dimensions of the content.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def computeDimensions()(): Unit

        /** Computes the dimensions of the indicator.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def computeIndicatorClientRect(): Unit

      }

      @js.native
      @JSImport("@material/mwc-tab", JSImport.Default)
      object RawImport extends js.Object {}
      RawImport // needed because objects are lazy

      type Ref         = dom.html.Element with RawElement
      type El          = ReactiveHtmlElement[Ref]
      type ModFunction = Tab.type => Mod[El]

      private val tag = new HtmlTag[Ref]("mwc-tab", void = false)

      object slots {

        /** Slotted icon to display. Only available if hasImageIcon or icon are defined.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        def icon(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "icon"))

      }

      /** Text label to display in tab.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val `label` = new ReactiveProp("label", StringAsIsCodec)

      /** Material design icon name to display (overridden by slotted icon).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val `icon` = new ReactiveProp("icon", StringAsIsCodec)

      /** Displays a slot to show an image icon.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val `hasImageIcon` = new ReactiveProp("hasImageIcon", BooleanAsIsCodec)

      /** Material design icon name to display as the indicator.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val `indicatorIcon` = new ReactiveProp("indicatorIcon", StringAsIsCodec)

      /** Indicator fades in and out instead of sliding.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val `isFadingIndicator` = new ReactiveProp("isFadingIndicator", BooleanAsIsCodec)

      /** Shrinks tab as narrow as possible without causing text to wrap.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val `minWidth` = new ReactiveProp("minWidth", BooleanAsIsCodec)

      /** Shrinks indicator to be the size of the content.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val `isMinWidthIndicator` = new ReactiveProp("isMinWidthIndicator", BooleanAsIsCodec)

      /** Stacks icon on top of label text.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val `stacked` = new ReactiveProp("stacked", BooleanAsIsCodec)

      /** Emitted when the Tab is interacted with, regardless of its active state. Used by parent components to know which Tab to activate.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
        */
      val onInteracted = new EventProp[dom.Event]("MDCTab:interacted")

      object styles {
        import com.raquo.domtypes.generic.keys.Style

        /** Height of the tab.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        val tabHeight = new ReactiveStyle(new Style("--mdc-tab-height", "--mdc-tab-height"))

        /** Horizontal padding on either side of the tab.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        val tabHorizontalPadding = new ReactiveStyle(
          new Style("--mdc-tab-horizontal-padding", "--mdc-tab-horizontal-padding"),
        )

        /** Height of the tab's stacked variant.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        val tabStackedHeight = new ReactiveStyle(new Style("--mdc-tab-stacked-height", "--mdc-tab-stacked-height"))

        /** Color of an unactivated tab label.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        val tabTextLabelColorDefault = new ReactiveStyle(
          new Style("--mdc-tab-text-label-color-default", "--mdc-tab-text-label-color-default"),
        )

        /** Color of an unactivated icon.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab">Component Documentation</a>
          */
        val tabColorDefault = new ReactiveStyle(new Style("--mdc-tab-color-default", "--mdc-tab-color-default"))

      }

      def apply(mods: ModFunction*): HtmlElement = {
        tag(mods.map(_(Tab)): _*)
      }

    }

  }

  /** mwc-list
    *
    * Lists are continuous, vertical indexes of text or images.
    *
    * {@literal @material/mwc-list@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
    */
  object List {

    @js.native
    trait RawElement extends js.Object {

      /** Sets `activated` attribute on selected items which provides a focus-persistent highlight.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `activatable`: Boolean

      /** When `true`, sets `tabindex="0"` on the internal list. Otherwise sets `tabindex="-1"`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `rootTabbable`: Boolean

      /** When `true`, enables selection of multiple items. This will result in `index` being of type `Set<number>` and selected returning `ListItemBase[]`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `multi`: Boolean

      /** When `true`, pressing `up` on the keyboard when focused on the first item will focus the last item and `down` when focused on the last item will focus the first item.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `wrapFocus`: Boolean

      /** Determines what `role` attribute to set on all list items.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `itemRoles`: String

      /** Role of the internal `<ul>` element.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `innerRole`: String

      /** When `true`, disables focus and pointer events (thus ripples) on the list. Used for display-only lists.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `noninteractive`: Boolean

      /** All list items that are available for selection. Eligible items have the `[mwc-list-item]` attribute which `ListItemBase` applies automatically.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `items`: Any

      /** Currently-selected list item(s). When `multi` is `true`, `selected` is of type `ListItemBase[]` and when `false`, `selected` is of type `ListItemBase`. `selected` is `null` when no item is selected.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `selected`: Any

      /** Index / indices of selected item(s). When `multi` is `true`, `index` is of type `number` and when `false`, `index` is of type `Set<number>`. Unset indicies are `-1` and empty `Set<number>` for single and multi selection respectively.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def `index`: Any

      /** Selects the elements at the given index / indices.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def select(): Unit

      /** Toggles the selected index, and forcibly selects or deselects the value of `force` if attribtue is provided.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def toggle(): Unit

      /** Returns the index of the currently-focused item. `-1` if none are focused.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def getFocusedItemIndex(): Unit

      /** Focuses the item at the given index and manages tabindex on all other items.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def focusItemAtIndex(): Unit

      /** Resets tabindex on all items and will update items model if provided true. It may be required to call layout if selectability of an element is dynamically changed. e.g. `[mwc-list-item]` attribute is removed from a list item or `noninteractive` is dynamically set on a list item.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def layout(): Unit

    }

    @js.native
    @JSImport("@material/mwc-list", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = List.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-list", void = false)

    object slots {

      /** Content to display in the lists internal <ul> element.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

    }

    /** Sets `activated` attribute on selected items which provides a focus-persistent highlight.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val `activatable` = new ReactiveProp("activatable", BooleanAsIsCodec)

    /** When `true`, sets `tabindex="0"` on the internal list. Otherwise sets `tabindex="-1"`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val `rootTabbable` = new ReactiveProp("rootTabbable", BooleanAsIsCodec)

    /** When `true`, enables selection of multiple items. This will result in `index` being of type `Set<number>` and selected returning `ListItemBase[]`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val `multi` = new ReactiveProp("multi", BooleanAsIsCodec)

    /** When `true`, pressing `up` on the keyboard when focused on the first item will focus the last item and `down` when focused on the last item will focus the first item.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val `wrapFocus` = new ReactiveProp("wrapFocus", BooleanAsIsCodec)

    /** Determines what `role` attribute to set on all list items.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val `itemRoles` = new ReactiveProp("itemRoles", StringAsIsCodec)

    /** Role of the internal `<ul>` element.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val `innerRole` = new ReactiveProp("innerRole", StringAsIsCodec)

    /** When `true`, disables focus and pointer events (thus ripples) on the list. Used for display-only lists.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val `noninteractive` = new ReactiveProp("noninteractive", BooleanAsIsCodec)

    /** Fired when a selection has been made via click or keyboard aciton.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val onAction = new EventProp[dom.Event]("action")

    /** Fired when a selection has been made. index is the selected index (will be of type Set<number> if multi and number if single), and diff (of type IndexDiff**) represents the diff of added and removed indices from previous selection.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
      */
    val onSelected = new EventProp[dom.Event]("selected")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Padding before and after the first and last list items.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      val listVerticalPadding = new ReactiveStyle(
        new Style("--mdc-list-vertical-padding", "--mdc-list-vertical-padding"),
      )

      /** Adjusts the padding of the [padded] list dividers (also propagates to mwc-list-item).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      val listSidePadding = new ReactiveStyle(new Style("--mdc-list-side-padding", "--mdc-list-side-padding"))

      /** Adjusts the left inset padding of an [inset] list divider. Typically used for dividing list items with icons.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar">Component Documentation</a>
        */
      val listInsetMargin = new ReactiveStyle(new Style("--mdc-list-inset-margin", "--mdc-list-inset-margin"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(List)): _*)
    }

    /** mwc-list-item
      *
      * List item
      *
      * {@literal @material/mwc-list-item@0.18.0}
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
      */
    object ListItem {

      @js.native
      trait RawElement extends js.Object {

        /** Value associated with this list item (used by mwc-select).
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `value`: String

        /** Used to group items together (used by mwc-menu for menu selection groups and mwc-radio-list-element).
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `group`: String

        /** Reflects tabindex and sets internal tab indices.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `tabindex`: Double

        /** Reflects disabled and sets internal disabled attributes.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `disabled`: Boolean

        /** Activates the two-line variant and enables the secondary slot.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `twoline`: Boolean

        /** Activates focus-persistent ripple.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `activated`: Boolean

        /** Determines which graphic layout to show and enables the graphic slot.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `graphic`: Any

        /** Allows arbitrary width for multiple slotted graphics.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `multipleGraphics`: Boolean

        /** Activates the meta layout tile and enables the meta slot.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `hasMeta`: Boolean

        /** Disables focus and pointer events for the list item.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `noninteractive`: Boolean

        /** Denotes that the list item is selected.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `selected`: Boolean

        /** Trimmed textContent of the list item.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def `text`: String

      }

      @js.native
      @JSImport("@material/mwc-list/mwc-list-item", JSImport.Default)
      object RawImport extends js.Object {}
      RawImport // needed because objects are lazy

      type Ref         = dom.html.Element with RawElement
      type El          = ReactiveHtmlElement[Ref]
      type ModFunction = ListItem.type => Mod[El]

      private val tag = new HtmlTag[Ref]("mwc-list-item", void = false)

      object slots {

        /** Primary text to display in the list item. Note, text must be wrapped in an inline node to be styled for disabled variant.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

        /** First tile graphic to display when graphic attribute is defined.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def graphic(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "graphic"))

        /** Last tile meta icon or text to display when hasMeta is true.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def meta(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "meta"))

        /** Secondary text displayed below primary text of a two-line list item.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        def secondary(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "secondary"))

      }

      /** Value associated with this list item (used by mwc-select).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `value` = new ReactiveProp("value", StringAsIsCodec)

      /** Used to group items together (used by mwc-menu for menu selection groups and mwc-radio-list-element).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `group` = new ReactiveProp("group", StringAsIsCodec)

      /** Reflects tabindex and sets internal tab indices.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `tabindex` = new ReactiveProp("tabindex", DoubleAsIsCodec)

      /** Reflects disabled and sets internal disabled attributes.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

      /** Activates the two-line variant and enables the secondary slot.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `twoline` = new ReactiveProp("twoline", BooleanAsIsCodec)

      /** Activates focus-persistent ripple.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `activated` = new ReactiveProp("activated", BooleanAsIsCodec)

      /** Allows arbitrary width for multiple slotted graphics.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `multipleGraphics` = new ReactiveProp("multipleGraphics", BooleanAsIsCodec)

      /** Activates the meta layout tile and enables the meta slot.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `hasMeta` = new ReactiveProp("hasMeta", BooleanAsIsCodec)

      /** Disables focus and pointer events for the list item.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `noninteractive` = new ReactiveProp("noninteractive", BooleanAsIsCodec)

      /** Denotes that the list item is selected.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `selected` = new ReactiveProp("selected", BooleanAsIsCodec)

      /** Trimmed textContent of the list item.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val `text` = new ReactiveProp("text", StringAsIsCodec)

      /** Fired upon click and when selected property is changed. Requests selection from the mwc-list.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
        */
      val onRequestSelected = new EventProp[dom.Event]("request-selected")

      object styles {
        import com.raquo.domtypes.generic.keys.Style

        /** Line height of the meta icon or text and width & height of the slotted parent wrapper.
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        val listItemMetaSize = new ReactiveStyle(new Style("--mdc-list-item-meta-size", "--mdc-list-item-meta-size"))

        /** Line height of the graphic and width & height of the slotted parent wrapper. 24px when graphic is "icon". 40px when graphic is "avatar". 56px when graphic is "medium", and "large".
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        val listItemGraphicSize = new ReactiveStyle(
          new Style("--mdc-list-item-graphic-size", "--mdc-list-item-graphic-size"),
        )

        /** Margin between the text and graphic. 16px when graphic is "avatar", "medium", "large", and "control". 32px when graphic is "icon".
          *
          * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/list">Component Documentation</a>
          */
        val listItemGraphicMargin = new ReactiveStyle(
          new Style("--mdc-list-item-graphic-margin", "--mdc-list-item-graphic-margin"),
        )

      }

      def apply(mods: ModFunction*): HtmlElement = {
        tag(mods.map(_(ListItem)): _*)
      }

    }

  }

  /** mwc-menu
    *
    * Menus display a list of choices on temporary surfaces.
    *
    * {@literal @material/mwc-menu@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
    */
  object Menu {

    @js.native
    trait RawElement extends js.Object {

      /** Whether the menu should open and display.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `open`: Boolean

      /** Determines from which element the floating menu should calculate sizing and position offsets. In the default case, both mwc-menu and the anchor should share a parent with position:relative. Changing anchor typically requires absolute or fixed.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `anchor`: Any

      /** Corner of the anchor from which the menu should position itself.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `corner`: String

      /** Horizontal corner of the menu from which the menu should position itself. **NOTE:** Only horizontal corners are supported.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `menuCorner`: String

      /** Whether to skip the opening animation.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `quick`: Boolean

      /** Makes the menu's position absolute which will be relative to whichever ancestor has position:relative. Setting x and y will modify the menu's left and top. Setting anchor will attempt to position the menu to the anchor.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `absolute`: Boolean

      /** Makes the menu's position fixed which will be relative to the window. Setting x and y will modify the menu's left and top. Setting anchor will attempt to position the menu to the anchor's immediate position before opening.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `fixed`: Boolean

      /** Sets horizontal position when absolute or fixed. When given an anchor, sets horizontal position relative to anchor at given corner. Requires y not to be null.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `x`: Double

      /** Sets vertical position when absolute or fixed. When given an anchor, sets vertical position relative to anchor at given corner. Requires x not to be null.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `y`: Double

      /** Forces a menu group to have a selected item by preventing deselection of menu items in menu groups via user interaction.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `forceGroupSelection`: Boolean

      /** Item to focus upon menu open.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `defaultFocus`: String

      /** Sets surface width to 100%.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `fullwidth`: Boolean

      /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) wrapFocus property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `wrapFocus`: Boolean

      /** menu
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `innerRole`: Any

      /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) multi property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `multi`: Boolean

      /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) activatable property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `activatable`: Boolean

      /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) items property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `items`: Any

      /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) index property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `index`: Any

      /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) selected property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def `selected`: Any

      /**  Sets `open` to false.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def show(): Unit

      /**  Sets `open` to true.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def close(): Unit

      /**  Selects the elements at the given index / indices.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def select(): Unit

      /**  Returns the index of the currently-focused item. `-1` if none are focused.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def getFocusedItemIndex(): Unit

      /**  Focuses the item at the given index and manages tabindex on all other items.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def focusItemAtIndex(): Unit

      /**  Resets tabindex on all items and will update `items` model if provided true. It may be required to call layout if selectability of an element is dynamically changed. e.g. `[mwc-list-item]` attribute is removed from a list item or `noninteractive` is dynamically set on a list item.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def layout(): Unit

    }

    @js.native
    @JSImport("@material/mwc-menu", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Menu.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-menu", void = false)

    object slots {

      /** Content to display in the menus internal <mwc-list> element.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

    }

    /** Whether the menu should open and display.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `open` = new ReactiveProp("open", BooleanAsIsCodec)

    /** Corner of the anchor from which the menu should position itself.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `corner` = new ReactiveProp("corner", StringAsIsCodec)

    /** Horizontal corner of the menu from which the menu should position itself. **NOTE:** Only horizontal corners are supported.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `menuCorner` = new ReactiveProp("menuCorner", StringAsIsCodec)

    /** Whether to skip the opening animation.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `quick` = new ReactiveProp("quick", BooleanAsIsCodec)

    /** Makes the menu's position absolute which will be relative to whichever ancestor has position:relative. Setting x and y will modify the menu's left and top. Setting anchor will attempt to position the menu to the anchor.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `absolute` = new ReactiveProp("absolute", BooleanAsIsCodec)

    /** Makes the menu's position fixed which will be relative to the window. Setting x and y will modify the menu's left and top. Setting anchor will attempt to position the menu to the anchor's immediate position before opening.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `fixed` = new ReactiveProp("fixed", BooleanAsIsCodec)

    /** Sets horizontal position when absolute or fixed. When given an anchor, sets horizontal position relative to anchor at given corner. Requires y not to be null.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `x` = new ReactiveProp("x", DoubleAsIsCodec)

    /** Sets vertical position when absolute or fixed. When given an anchor, sets vertical position relative to anchor at given corner. Requires x not to be null.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `y` = new ReactiveProp("y", DoubleAsIsCodec)

    /** Forces a menu group to have a selected item by preventing deselection of menu items in menu groups via user interaction.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `forceGroupSelection` = new ReactiveProp("forceGroupSelection", BooleanAsIsCodec)

    /** Item to focus upon menu open.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `defaultFocus` = new ReactiveProp("defaultFocus", StringAsIsCodec)

    /** Sets surface width to 100%.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `fullwidth` = new ReactiveProp("fullwidth", BooleanAsIsCodec)

    /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) wrapFocus property.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `wrapFocus` = new ReactiveProp("wrapFocus", BooleanAsIsCodec)

    /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) multi property.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `multi` = new ReactiveProp("multi", BooleanAsIsCodec)

    /** Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) activatable property.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val `activatable` = new ReactiveProp("activatable", BooleanAsIsCodec)

    /** Fired when opened.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val onOpened = new EventProp[dom.Event]("opened")

    /** Fired when closed.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val onClosed = new EventProp[dom.Event]("closed")

    /** Fired when a selection has been made via click or keyboard aciton.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val onAction = new EventProp[dom.Event]("action")

    /** Fired when a selection has been made. `index` is the selected index (will be of type `Set<number>` if multi and `number` if single), and `diff` (of type `IndexDiff`**) represents the diff of added and removed indices from previous selection.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
      */
    val onSelected = new EventProp[dom.Event]("selected")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Border radius of the dropdown.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      val shapeMedium = new ReactiveStyle(new Style("--mdc-shape-medium", "--mdc-shape-medium"))

      /** Height of single-line list-items in the menu.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      val menuItemHeight = new ReactiveStyle(new Style("--mdc-menu-item-height", "--mdc-menu-item-height"))

      /** Menu min-width.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      val menuMinWidth = new ReactiveStyle(new Style("--mdc-menu-min-width", "--mdc-menu-min-width"))

      /** Menu max-width.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      val menuMaxWidth = new ReactiveStyle(new Style("--mdc-menu-max-width", "--mdc-menu-max-width"))

      /** Menu max height.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      val menuMaxHeight = new ReactiveStyle(new Style("--mdc-menu-max-height", "--mdc-menu-max-height"))

      /** Z-index of the popup menu surface.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      val menuZIndex = new ReactiveStyle(new Style("--mdc-menu-z-index", "--mdc-menu-z-index"))

      /** Color of the menu surface.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/menu">Component Documentation</a>
        */
      val themeSurface = new ReactiveStyle(new Style("--mdc-theme-surface", "--mdc-theme-surface"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Menu)): _*)
    }

  }

  /** mwc-textfield
    *
    * Text fields let users enter and edit text.
    *
    * {@literal @material/mwc-textfield@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
    */
  object Textfield {

    @js.native
    trait RawElement extends js.Object {

      /** The input control's value.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `value`: String

      /** A string specifying the type of control to render.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `type`: String

      /** Sets floating label value.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `label`: String

      /** Sets disappearing input placeholder.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `placeholder`: String

      /** Prefix text to display before the input.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `prefix`: String

      /** Suffix text to display after the input.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `suffix`: String

      /** Leading icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `icon`: String

      /** Trailing icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `iconTrailing`: String

      /** Whether or not the input should be disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `disabled`: Boolean

      /** **Note: requries maxLength to be set.** Display character counter with max length.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `charCounter`: Boolean

      /** Whether or not to show the material outlined variant.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `outlined`: Boolean

      /** Helper text to display below the input. Display default only when focused.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `helper`: String

      /** Always show the helper text despite focus.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `helperPersistent`: Boolean

      /** Displays error state if value is empty and input is blurred.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `required`: Boolean

      /** Maximum length to accept input.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `maxLength`: Double

      /** Message to show in the error color when the textfield is invalid. (Helper text will not be visible)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `validationMessage`: String

      /** [HTMLInputElement.prototype.pattern](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `pattern`: String

      /** [HTMLInputElement.prototype.min](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `min`: String

      /** [HTMLInputElement.prototype.max](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `max`: String

      /** [HTMLInputElement.prototype.Size](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefsize) (null will unset attribute)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `size`: Double

      /** [HTMLInputElement.prototype.Step](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (null will unset attribute)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `step`: Double

      /** Reports validity on input rather than only on blur.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `autoValidate`: Boolean

      /** The [ValidityState](https://developer.mozilla.org/en-US/docs/Web/API/ValidityState) of the textfield.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `validity`: Any

      /** [HTMLInputElement.prototype.willValidate](https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement#Properties)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `willValidate`: Boolean

      /** Callback called before each validation check. See the [validation section](#Validation) for more details.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `validityTransform`: Any

      /** Runs validation check on initial render.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `validateOnInitialRender`: Boolean

      /** Sets the name attribute on the internal input.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def `name`: String

      /** Returns true if the textfield passes validity checks. Returns false and fires an invalid event on the textfield otherwise. NOTE: When accessing any property or function that checks validity at textfield initial boot up, you may have to await <mwc-textfield>.updateComplete.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def checkValidity(): Unit

      /** Runs checkValidity() method, and if it returns false, then it reports to the user that the input is invalid.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def reportValidity(): Unit

      /** Sets a custom validity message (also overwrites validationMessage). If this message is not the empty string, then the element is suffering from a custom validity error and does not validate.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def setCustomValidity(): Unit

      /** Selects the element at the given index.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def select(): Unit

      /** Re-calculate layout. If a textfield is styled with display:none before it is first rendered, and it has a label that is floating, then you must call layout() the first time you remove display:none, or else the notch surrounding the label will not render correctly.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      def layout(): Unit

    }

    @js.native
    @JSImport("@material/mwc-textfield", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Textfield.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-textfield", void = false)

    object slots {}

    /** The input control's value.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `value` = new ReactiveProp("value", StringAsIsCodec)

    /** A string specifying the type of control to render.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `type` = new ReactiveProp("type", StringAsIsCodec)

    /** Sets floating label value.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `label` = new ReactiveProp("label", StringAsIsCodec)

    /** Sets disappearing input placeholder.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `placeholder` = new ReactiveProp("placeholder", StringAsIsCodec)

    /** Prefix text to display before the input.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `prefix` = new ReactiveProp("prefix", StringAsIsCodec)

    /** Suffix text to display after the input.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `suffix` = new ReactiveProp("suffix", StringAsIsCodec)

    /** Leading icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `icon` = new ReactiveProp("icon", StringAsIsCodec)

    /** Trailing icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `iconTrailing` = new ReactiveProp("iconTrailing", StringAsIsCodec)

    /** Whether or not the input should be disabled.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    /** **Note: requries maxLength to be set.** Display character counter with max length.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `charCounter` = new ReactiveProp("charCounter", BooleanAsIsCodec)

    /** Whether or not to show the material outlined variant.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `outlined` = new ReactiveProp("outlined", BooleanAsIsCodec)

    /** Helper text to display below the input. Display default only when focused.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `helper` = new ReactiveProp("helper", StringAsIsCodec)

    /** Always show the helper text despite focus.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `helperPersistent` = new ReactiveProp("helperPersistent", BooleanAsIsCodec)

    /** Displays error state if value is empty and input is blurred.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `required` = new ReactiveProp("required", BooleanAsIsCodec)

    /** Maximum length to accept input.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `maxLength` = new ReactiveProp("maxLength", DoubleAsIsCodec)

    /** Message to show in the error color when the textfield is invalid. (Helper text will not be visible)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `validationMessage` = new ReactiveProp("validationMessage", StringAsIsCodec)

    /** [HTMLInputElement.prototype.pattern](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `pattern` = new ReactiveProp("pattern", StringAsIsCodec)

    /** [HTMLInputElement.prototype.min](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `min` = new ReactiveProp("min", StringAsIsCodec)

    /** [HTMLInputElement.prototype.max](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `max` = new ReactiveProp("max", StringAsIsCodec)

    /** [HTMLInputElement.prototype.Size](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefsize) (null will unset attribute)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `size` = new ReactiveProp("size", DoubleAsIsCodec)

    /** [HTMLInputElement.prototype.Step](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (null will unset attribute)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `step` = new ReactiveProp("step", DoubleAsIsCodec)

    /** Reports validity on input rather than only on blur.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `autoValidate` = new ReactiveProp("autoValidate", BooleanAsIsCodec)

    /** [HTMLInputElement.prototype.willValidate](https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement#Properties)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `willValidate` = new ReactiveProp("willValidate", BooleanAsIsCodec)

    /** Runs validation check on initial render.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `validateOnInitialRender` = new ReactiveProp("validateOnInitialRender", BooleanAsIsCodec)

    /** Sets the name attribute on the internal input.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
      */
    val `name` = new ReactiveProp("name", StringAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Border radius of the standard / filled textfield's background filling.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldFilledBorderRadius = new ReactiveStyle(
        new Style("--mdc-text-field-filled-border-radius", "--mdc-text-field-filled-border-radius"),
      )

      /** Color of the filled textfield's bottom line when idle.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldIdleLineColor = new ReactiveStyle(
        new Style("--mdc-text-field-idle-line-color", "--mdc-text-field-idle-line-color"),
      )

      /** Color of the filled textfield's bottom line when hovering.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldHoverLineColor = new ReactiveStyle(
        new Style("--mdc-text-field-hover-line-color", "--mdc-text-field-hover-line-color"),
      )

      /** Color of the filled textfield's bottom line when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldDisabledLineColor = new ReactiveStyle(
        new Style("--mdc-text-field-disabled-line-color", "--mdc-text-field-disabled-line-color"),
      )

      /** Color of the outlined textfield'soutline when idle.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldOutlinedIdleBorderColor = new ReactiveStyle(
        new Style("--mdc-text-field-outlined-idle-border-color", "--mdc-text-field-outlined-idle-border-color"),
      )

      /** Color of the outlined textfield's outline when hovering.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldOutlinedHoverBorderColor = new ReactiveStyle(
        new Style("--mdc-text-field-outlined-hover-border-color", "--mdc-text-field-outlined-hover-border-color"),
      )

      /** Color of the outlined textfield's outline when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldOutlinedDisabledBorderColor = new ReactiveStyle(
        new Style("--mdc-text-field-outlined-disabled-border-color", "--mdc-text-field-outlined-disabled-border-color"),
      )

      /** Color of the textfield's background fill (non-outlined).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldFillColor = new ReactiveStyle(
        new Style("--mdc-text-field-fill-color", "--mdc-text-field-fill-color"),
      )

      /** Color of the textfield's background fill (non-outlined) when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldDisabledFillColor = new ReactiveStyle(
        new Style("--mdc-text-field-disabled-fill-color", "--mdc-text-field-disabled-fill-color"),
      )

      /** Color of the input text.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldInkColor = new ReactiveStyle(new Style("--mdc-text-field-ink-color", "--mdc-text-field-ink-color"))

      /** Color of the non-focused floating label, helper text, char counter, and placeholder.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldLabelInkColor = new ReactiveStyle(
        new Style("--mdc-text-field-label-ink-color", "--mdc-text-field-label-ink-color"),
      )

      /** Color of the input text, the floating label, helper text, char counter, and placeholder of a disabled textfield.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textfield">Component Documentation</a>
        */
      val textFieldDisabledInkColor = new ReactiveStyle(
        new Style("--mdc-text-field-disabled-ink-color", "--mdc-text-field-disabled-ink-color"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Textfield)): _*)
    }

  }

  /** mwc-textarea
    *
    * Text areas let users enter and edit text.
    *
    * {@literal @material/mwc-textarea@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
    */
  object Textarea {

    @js.native
    trait RawElement extends js.Object {

      /** Sets number of visible text lines.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `rows`: Double

      /** Sets the visible width of the textarea.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `cols`: Double

      /** The input control's value.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `value`: String

      /** A string specifying the type of control to render.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `type`: String

      /** Sets floating label value.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `label`: String

      /** Sets disappearing input placeholder.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `placeholder`: String

      /** Leading icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `icon`: String

      /** Trailing icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `iconTrailing`: String

      /** Whether or not the input should be disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `disabled`: Boolean

      /** **Note: requires maxLength to be set.** Display character counter with max length. Textareas may display an "external" or "internal" charCounter. When true, textareas display an external character counter by default.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `charCounter`: Boolean

      /** Whether or not to show the material outlined variant.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `outlined`: Boolean

      /** Helper text to display below the input. Display default only when focused.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `helper`: String

      /** Always show the helper text despite focus.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `helperPersistent`: Boolean

      /** Displays error state if value is empty and input is blurred.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `required`: Boolean

      /** Maximum length input to accept.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `maxLength`: Double

      /** Message to show in the error color when the textarea is invalid. (Helper text will not be visible)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `validationMessage`: String

      /** The [ValidityState](https://developer.mozilla.org/en-US/docs/Web/API/ValidityState) of the textfield.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `validity`: Any

      /** [HTMLInputElement.prototype.willValidate](https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement#Properties)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `willValidate`: Boolean

      /** Callback called before each validation check. See the [validation section](#Validation) for more details.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `validityTransform`: Any

      /** Runs validation check on initial render.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `validateOnInitialRender`: Boolean

      /** Sets the name attribute on the internal textarea.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def `ame`: String

      /** Returns true if the textarea passes validity checks. Returns false and fires an invalid event on the textarea otherwise.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def checkValidity(): Unit

      /** Runs checkValidity() method, and if it returns false, then it reports to the user that the input is invalid.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def reportValidity(): Unit

      /** Sets a custom validity message (also overwrites validationMessage). If this message is not the empty string, then the element is suffering from a custom validity error and does not validate.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def setCustomValidity(): Unit

      /** Selects the element at the given index.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def select(): Unit

      /** Re-calculate layout. If a textarea is styled with display:none before it is first rendered, and it has a label that is floating, then you must call layout() the first time you remove display:none, or else the notch surrounding the label will not render correctly.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      def layout(): Unit

    }

    @js.native
    @JSImport("@material/mwc-textarea", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Textarea.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-textarea", void = false)

    object slots {}

    /** Sets number of visible text lines.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `rows` = new ReactiveProp("rows", DoubleAsIsCodec)

    /** Sets the visible width of the textarea.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `cols` = new ReactiveProp("cols", DoubleAsIsCodec)

    /** The input control's value.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `value` = new ReactiveProp("value", StringAsIsCodec)

    /** A string specifying the type of control to render.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `type` = new ReactiveProp("type", StringAsIsCodec)

    /** Sets floating label value.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `label` = new ReactiveProp("label", StringAsIsCodec)

    /** Sets disappearing input placeholder.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `placeholder` = new ReactiveProp("placeholder", StringAsIsCodec)

    /** Leading icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `icon` = new ReactiveProp("icon", StringAsIsCodec)

    /** Trailing icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `iconTrailing` = new ReactiveProp("iconTrailing", StringAsIsCodec)

    /** Whether or not the input should be disabled.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    /** **Note: requires maxLength to be set.** Display character counter with max length. Textareas may display an "external" or "internal" charCounter. When true, textareas display an external character counter by default.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `charCounter` = new ReactiveProp("charCounter", BooleanAsIsCodec)

    /** Whether or not to show the material outlined variant.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `outlined` = new ReactiveProp("outlined", BooleanAsIsCodec)

    /** Helper text to display below the input. Display default only when focused.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `helper` = new ReactiveProp("helper", StringAsIsCodec)

    /** Always show the helper text despite focus.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `helperPersistent` = new ReactiveProp("helperPersistent", BooleanAsIsCodec)

    /** Displays error state if value is empty and input is blurred.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `required` = new ReactiveProp("required", BooleanAsIsCodec)

    /** Maximum length input to accept.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `maxLength` = new ReactiveProp("maxLength", DoubleAsIsCodec)

    /** Message to show in the error color when the textarea is invalid. (Helper text will not be visible)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `validationMessage` = new ReactiveProp("validationMessage", StringAsIsCodec)

    /** [HTMLInputElement.prototype.willValidate](https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement#Properties)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `willValidate` = new ReactiveProp("willValidate", BooleanAsIsCodec)

    /** Runs validation check on initial render.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `validateOnInitialRender` = new ReactiveProp("validateOnInitialRender", BooleanAsIsCodec)

    /** Sets the name attribute on the internal textarea.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
      */
    val `ame` = new ReactiveProp("ame", StringAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Border radius of the standard / filled textarea's background filling.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      val textAreaFilledBorderRadius = new ReactiveStyle(
        new Style("--mdc-text-area-filled-border-radius", "--mdc-text-area-filled-border-radius"),
      )

      /** Color of the outlined textarea's  outline when idle.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      val textAreaOutlinedIdleBorderColor = new ReactiveStyle(
        new Style("--mdc-text-area-outlined-idle-border-color", "--mdc-text-area-outlined-idle-border-color"),
      )

      /** Color of the outlined textarea's outline when hovering.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      val textAreaOutlinedHoverBorderColor = new ReactiveStyle(
        new Style("--mdc-text-area-outlined-hover-border-color", "--mdc-text-area-outlined-hover-border-color"),
      )

      /** Color of the outlined textarea's outline when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/textarea">Component Documentation</a>
        */
      val textAreaOutlinedDisabledBorderColor = new ReactiveStyle(
        new Style("--mdc-text-area-outlined-disabled-border-color", "--mdc-text-area-outlined-disabled-border-color"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Textarea)): _*)
    }

  }

  /** mwc-select
    *
    * Selects display a list of choices on temporary surfaces.
    *
    * {@literal @material/mwc-select@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
    */
  object Select {

    @js.native
    trait RawElement extends js.Object {

      /** The select control's value determined by the value property of the currently selected list item. Setting value will attempt to select a list-item with the same value. If one does not match, it will set itself to "" and the index to -1. Setting value before the list item is attached will not select the item.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `value`: String

      /** Sets floating label value. __NOTE:__ The label will not float if the selected item has a falsey value property.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `label`: String

      /** Sets the dropdown menu's width to auto.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `naturalMenuWidth`: String

      /** Leading icon to display in select. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon). _Note_: for proper list spacing, each list item must have graphic="icon" or graphic="avatar" to be set.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `icon`: String

      /** Whether or not the select should be disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `disabled`: Boolean

      /** Whether or not to show the material outlined variant.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `outlined`: Boolean

      /** Helper text to display below the select. Display default only when focused.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `helper`: String

      /** Always show the helper text despite focus.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `helperPersistent`: Boolean

      /** Displays error state if value is empty and select is blurred.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `required`: Boolean

      /** Message to show in the error color when the select is invalid. (Helper text will not be visible)
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `validationMessage`: String

      /** Selected list item element.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `selected`: Any

      /** List of selectable items.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `items`: Any

      /** Index of selected list item.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `index`: Double

      /** The [ValidityState](https://developer.mozilla.org/en-US/docs/Web/API/ValidityState) of the select.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `validity`: Any

      /** Callback called before each validation check. See the [mwc-textfield's validation section](https://github.com/material-components/material-components-web-components/tree/master/packages/textfield#validation) for more details.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `validityTransform`: Any

      /** Runs validation check on initial render.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def `validateOnInitialRender`: Boolean

      /** Returns `true` if the select passes validity checks. Returns `false` and fires an [`invalid`](https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement/invalid_event) event on the select otherwise. <br>**NOTE:** When accessing any property or function that checks validity at select initial boot up, you may have to await `<mwc-select>.updateComplete`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def checkValidity(): Unit

      /** Runs `checkValidity()` method, and if it returns false, then it reports to the user that the input is invalid.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def reportValidity(): Unit

      /** Sets a custom validity message (also overwrites `validationMessage`). If this message is not the empty string, then the element is suffering from a custom validity error and does not validate.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def setCustomValidity(): Unit

      /** Selects the element at the given index.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def select(): Unit

      /** Resets tabindex on all items and will update `items` model if provided true. It may be required to call layout if selectability of an element is dynamically changed. e.g. `[mwc-list-item]` attribute is removed from a list item or `noninteractive` is dynamically set on a list item. Also re-calculates layout. If a select is styled with `display:none` before it is first rendered, and it has a label that is floating, then you must call `layout()` the first time you remove `display:none`, or else the notch surrounding the label will not render correctly.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def layout(): Unit

    }

    @js.native
    @JSImport("@material/mwc-select", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Select.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-select", void = false)

    object slots {

      /** Content to display in the selects internal <mwc-menu> element.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

    }

    /** The select control's value determined by the value property of the currently selected list item. Setting value will attempt to select a list-item with the same value. If one does not match, it will set itself to "" and the index to -1. Setting value before the list item is attached will not select the item.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `value` = new ReactiveProp("value", StringAsIsCodec)

    /** Sets floating label value. __NOTE:__ The label will not float if the selected item has a falsey value property.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `label` = new ReactiveProp("label", StringAsIsCodec)

    /** Sets the dropdown menu's width to auto.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `naturalMenuWidth` = new ReactiveProp("naturalMenuWidth", StringAsIsCodec)

    /** Leading icon to display in select. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon). _Note_: for proper list spacing, each list item must have graphic="icon" or graphic="avatar" to be set.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `icon` = new ReactiveProp("icon", StringAsIsCodec)

    /** Whether or not the select should be disabled.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

    /** Whether or not to show the material outlined variant.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `outlined` = new ReactiveProp("outlined", BooleanAsIsCodec)

    /** Helper text to display below the select. Display default only when focused.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `helper` = new ReactiveProp("helper", StringAsIsCodec)

    /** Always show the helper text despite focus.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `helperPersistent` = new ReactiveProp("helperPersistent", BooleanAsIsCodec)

    /** Displays error state if value is empty and select is blurred.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `required` = new ReactiveProp("required", BooleanAsIsCodec)

    /** Message to show in the error color when the select is invalid. (Helper text will not be visible)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `validationMessage` = new ReactiveProp("validationMessage", StringAsIsCodec)

    /** Index of selected list item.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `index` = new ReactiveProp("index", DoubleAsIsCodec)

    /** Runs validation check on initial render.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val `validateOnInitialRender` = new ReactiveProp("validateOnInitialRender", BooleanAsIsCodec)

    /** Fired menu opens.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val onOpened = new EventProp[dom.Event]("opened")

    /** Fired menu closes.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val onClosed = new EventProp[dom.Event]("closed")

    /** Fired when a selection has been made via click or keyboard action.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val onAction = new EventProp[dom.Event]("action")

    /** Fired when a selection has been made. Property `index` is the selected index (will  be of type `number`)
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
      */
    val onSelected = new EventProp[dom.Event]("selected")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Applies where --mdc-theme-error applies.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectErrorColor = new ReactiveStyle(new Style("--mdc-select-error-color", "--mdc-select-error-color"))

      /** Color of the filled select's bottom line when idle.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectIdleLineColor = new ReactiveStyle(
        new Style("--mdc-select-idle-line-color", "--mdc-select-idle-line-color"),
      )

      /** Color of the filled select's bottom line when hovering.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectHoverLineColor = new ReactiveStyle(
        new Style("--mdc-select-hover-line-color", "--mdc-select-hover-line-color"),
      )

      /** Color of the outlined select's outline when idle.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectOutlinedIdleBorderColor = new ReactiveStyle(
        new Style("--mdc-select-outlined-idle-border-color", "--mdc-select-outlined-idle-border-color"),
      )

      /** Color of the outlined select's outline when hovering.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectOutlinedHoverBorderColor = new ReactiveStyle(
        new Style("--mdc-select-outlined-hover-border-color", "--mdc-select-outlined-hover-border-color"),
      )

      /** Color of the outlined select's outline when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectOutlinedDisabledBorderColor = new ReactiveStyle(
        new Style("--mdc-select-outlined-disabled-border-color", "--mdc-select-outlined-disabled-border-color"),
      )

      /** Color of the select's background fill (non-outlined).
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectFillColor = new ReactiveStyle(new Style("--mdc-select-fill-color", "--mdc-select-fill-color"))

      /** Color of the select's background fill (non-outlined) when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectDisabledFillColor = new ReactiveStyle(
        new Style("--mdc-select-disabled-fill-color", "--mdc-select-disabled-fill-color"),
      )

      /** Color of the selected text in default and error states.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectInkColor = new ReactiveStyle(new Style("--mdc-select-ink-color", "--mdc-select-ink-color"))

      /** Color of the non-focused floating label, helper text, and placeholder.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectLabelInkColor = new ReactiveStyle(
        new Style("--mdc-select-label-ink-color", "--mdc-select-label-ink-color"),
      )

      /** Color of the focused floating label, helper text, and placeholder.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectFocusedLabelColor = new ReactiveStyle(
        new Style("--mdc-select-focused-label-color", "--mdc-select-focused-label-color"),
      )

      /** Color of the input text, the floating label, helper text, and placeholder of a disabled select.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectDisabledInkColor = new ReactiveStyle(
        new Style("--mdc-select-disabled-ink-color", "--mdc-select-disabled-ink-color"),
      )

      /** Color of the dropdown icon when select is not activated.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectDropdownIconColor = new ReactiveStyle(
        new Style("--mdc-select-dropdown-icon-color", "--mdc-select-dropdown-icon-color"),
      )

      /** Color of the dropdown icon when select is activated.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectFocusedDropdownIconColor = new ReactiveStyle(
        new Style("--mdc-select-focused-dropdown-icon-color", "--mdc-select-focused-dropdown-icon-color"),
      )

      /** Opacity of the dropdown icon when disabled.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectDisabledDropdownIconColor = new ReactiveStyle(
        new Style("--mdc-select-disabled-dropdown-icon-color ", "--mdc-select-disabled-dropdown-icon-color "),
      )

      /** Color of the dropdown icon when select is invalid.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/select">Component Documentation</a>
        */
      val selectErrorDropdownIconColor = new ReactiveStyle(
        new Style("--mdc-select-error-dropdown-icon-color", "--mdc-select-error-dropdown-icon-color"),
      )

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(Select)): _*)
    }

  }

  /** mwc-top-app-bar-fixed
    *
    * Fixed Top App Bars are a container for items such as application title, navigation icon, and action items that are always visible.
    *
    * {@literal @material/mwc-top-app-bar-fixed@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
    */
  object TopAppBarFixed {

    @js.native
    trait RawElement extends js.Object {

      /** Centers the title horizontally. Only meant to be used with 0 or 1 `actionItems`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      def `centerTitle`: Boolean

      /** Makes the bar a little smaller for higher density applications.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      def `dense`: Boolean

      /** Makes the bar much taller, can be combined with `dense`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      def `prominent`: Boolean

      /** Element used to listen for `scroll` events.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      def `scrollTarget`: Any

    }

    @js.native
    @JSImport("@material/mwc-top-app-bar-fixed", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = TopAppBarFixed.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-top-app-bar-fixed", void = false)

    object slots {

      /** Scrollable content to display under the bar. This may be the entire application.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

      /** A number of <mwc-icon-button> elements to use for action icons on the right side.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      def actionItems(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "actionItems"))

      /** One <mwc-icon-button> element to use for the left icon.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      def navigationIcon(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "navigationIcon"))

      /** A <div> or <span> that will be used as the title text.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      def title(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "title"))

    }

    /** Centers the title horizontally. Only meant to be used with 0 or 1 `actionItems`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
      */
    val `centerTitle` = new ReactiveProp("centerTitle", BooleanAsIsCodec)

    /** Makes the bar a little smaller for higher density applications.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
      */
    val `dense` = new ReactiveProp("dense", BooleanAsIsCodec)

    /** Makes the bar much taller, can be combined with `dense`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
      */
    val `prominent` = new ReactiveProp("prominent", BooleanAsIsCodec)

    /** Fired when the navigationIcon is clicked.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
      */
    val onNav = new EventProp[dom.Event]("MDCTopAppBar:nav")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Sets the box shadow of the fixed top app bar when scrolling.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      val topAppBarFixedBoxShadow = new ReactiveStyle(
        new Style("--mdc-top-app-bar-fixed-box-shadow", "--mdc-top-app-bar-fixed-box-shadow"),
      )

      /** Width of the `top-app-bar` in relation to the Window.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed">Component Documentation</a>
        */
      val topAppBarWidth = new ReactiveStyle(new Style("--mdc-top-app-bar-width", "--mdc-top-app-bar-width"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(TopAppBarFixed)): _*)
    }

  }

  /** mwc-top-app-bar
    *
    * Top App Bars are a container for items such as application title, navigation icon, and action items.
    *
    * {@literal @material/mwc-top-app-bar@0.18.0}
    *
    * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
    */
  object TopAppBar {

    @js.native
    trait RawElement extends js.Object {

      /** Centers the title horizontally. Only meant to be used with 0 or 1 `actionItems`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      def `centerTitle`: Boolean

      /** Makes the bar a little smaller for higher density applications.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      def `dense`: Boolean

      /** Makes the bar much taller, can be combined with `dense`.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      def `prominent`: Boolean

      /** Element used to listen for `scroll` events.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      def `scrollTarget`: Any

    }

    @js.native
    @JSImport("@material/mwc-top-app-bar", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = TopAppBar.type => Mod[El]

    private val tag = new HtmlTag[Ref]("mwc-top-app-bar", void = false)

    object slots {

      /** Scrollable content to display under the bar. This may be the entire application.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

      /** A number of <mwc-icon-button> elements to use for action icons on the right side.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      def actionItems(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "actionItems"))

      /** One <mwc-icon-button> element to use for the left icon.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      def navigationIcon(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "navigationIcon"))

      /** A <div> or <span> that will be used as the title text.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      def title(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "title"))

    }

    /** Centers the title horizontally. Only meant to be used with 0 or 1 `actionItems`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
      */
    val `centerTitle` = new ReactiveProp("centerTitle", BooleanAsIsCodec)

    /** Makes the bar a little smaller for higher density applications.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
      */
    val `dense` = new ReactiveProp("dense", BooleanAsIsCodec)

    /** Makes the bar much taller, can be combined with `dense`.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
      */
    val `prominent` = new ReactiveProp("prominent", BooleanAsIsCodec)

    /** Fired when the navigationIcon is clicked.
      *
      * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
      */
    val onNav = new EventProp[dom.Event]("MDCTopAppBar:nav")

    object styles {
      import com.raquo.domtypes.generic.keys.Style

      /** Width of the `top-app-bar` in relation to the Window.
        *
        * @see <a href="https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar">Component Documentation</a>
        */
      val topAppBarWidth = new ReactiveStyle(new Style("--mdc-top-app-bar-width", "--mdc-top-app-bar-width"))

    }

    def apply(mods: ModFunction*): HtmlElement = {
      tag(mods.map(_(TopAppBar)): _*)
    }

  }

}
