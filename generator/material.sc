/** Web Component definitions for Google's Material Web Components
  */

import $file.definition

import definition._

val componentCollection = WebComponentCollection(
  packageName = "material",
  link = "https://github.com/material-components/material-components-web-components",
  globalCssProperties = Seq(
    CSSProperty(
      name = "--mdc-theme-primary",
      description = "The theme primary color.",
    ),
    CSSProperty(
      name = "--mdc-theme-error",
      description = "The theme error color",
    ),
    CSSProperty(
      name = "--mdc-theme-secondary",
      description = "The theme secondary color.",
    ),
    CSSProperty(
      name = "--mdc-theme-surface",
      description = "The theme surface color.",
    ),
    CSSProperty(
      name = "--mdc-theme-background",
      description = "The theme background color.",
    ),
    CSSProperty(
      name = "--mdc-theme-on-primary",
      description = "Text and icons on top of a theme primary color background.",
    ),
    CSSProperty(
      name = "--mdc-theme-on-secondary",
      description = "Text and icons on top of a theme secondary color background.",
    ),
    CSSProperty(
      name = "--mdc-theme-on-surface",
      description = "Text and icons on top of a theme surface color background.",
    ),
  ),
  components = Seq(
    WebComponent(
      tag = "mwc-button",
      description = "Buttons allow users to take actions, and make choices, with a single tap.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/button",
      npmPackage = NpmPackage(name = "@material/mwc-button", version = "0.18.0"),
      slots = Slots(
        default = Some(
          DefaultSlot(description =
            "Default content to display between both icons and after label. NOTE: It is highly recommended to set the label property instead of projecting text as it will also set the aria-label",
          ),
        ),
        named = Seq(
          NamedSlot(
            name = "icon",
            description = "Leading icon. Overrides icon property. Use label or the icon property to set the aria-label.",
          ),
          NamedSlot(
            name = "trailingIcon",
            description =
              "Icon to show after the label. Overrides trailingIcon property. Use label or the trailingIcon property to set the aria-label.",
          ),
        ),
      ),
      properties = Seq(
        Property(
          name = "icon",
          tpe = WebComponentFieldType.String,
          description = "Icon to display, and `aria-label` value when `label` is not defined.",
        ),
        Property(
          name = "label",
          tpe = WebComponentFieldType.String,
          description = "Label to display for the button, and `aria-label`.",
        ),
        Property(
          name = "raised",
          tpe = WebComponentFieldType.Boolean,
          description = "Creates a contained button that is elevated above the surface.",
        ),
        Property(
          name = "unelevated",
          tpe = WebComponentFieldType.Boolean,
          description = "Creates a contained button that is flush with the surface.",
        ),
        Property(
          name = "outlined",
          tpe = WebComponentFieldType.Boolean,
          description = "Creates an outlined button that is flush with the surface.",
        ),
        Property(
          name = "dense",
          tpe = WebComponentFieldType.Boolean,
          description = "Makes the button text and container slightly smaller.",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description = "Disabled buttons cannot be interacted with and have no visual interaction effect.",
        ),
        Property(
          name = "trailingIcon",
          tpe = WebComponentFieldType.Boolean,
          description = "When `true`, `icon` will be displayed _after_ `label`.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-button-horizontal-padding",
          description =
            "Left and right padding of the button label (for outlined buttons the outline width is automatically subtracted).",
        ),
        CSSProperty(
          name = "--mdc-button-outline-width",
          description = "`width` of the outline of an outlined button and attempts to keep the component size constant.",
        ),
        CSSProperty(
          name = "--mdc-button-outline-color",
          description = "Color of the outline of an outlined element.",
        ),
        CSSProperty(
          name = "--mdc-button-disabled-fill-color",
          description = "Background fill color of a disabled raised or unelevated button.",
        ),
        CSSProperty(
          name = "--mdc-button-disabled-ink-color",
          description = "Text color of a disabled button as well as the outline color of a disabled outlined button.",
        ),
        CSSProperty(
          name = "--mdc-button-disabled-outline-color",
          description = "Sets the color of the outline of a disabled outlined button.",
        ),
        CSSProperty(
          name = "--mdc-button-raised-box-shadow",
          description = "Sets the box shadow of the raised button.",
        ),
        CSSProperty(
          name = "--mdc-button-raised-box-shadow-hover",
          description = "Sets the box shadow of the raised button when focused or hovered.",
        ),
        CSSProperty(
          name = "--mdc-button-raised-box-shadow-active",
          description = "Sets the box shadow of the raised button when active.",
        ),
        CSSProperty(
          name = "--mdc-button-raised-box-shadow-disabled",
          description = "Sets the box shadow of the raised button when disabled.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-checkbox",
      description =
        "Checkboxes allow the user to select one or more items from a set. Checkboxes can be used to turn an option on or off.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/checkbox",
      npmPackage = NpmPackage(name = "@material/mwc-checkbox", version = "0.18.0"),
      properties = Seq(
        Property(
          name = "checked",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether the checkbox is checked.",
        ),
        Property(
          name = "indeterminate",
          tpe = WebComponentFieldType.Boolean,
          description =
            "When a checkbox is the parent of a set of child checkboxes, the *indeterminate* state is used on the parent to indicate that some but not all of its children are checked.",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description = "When `true`, the checkbox cannot be interacted with, and renders in muted colors.",
        ),
        Property(
          name = "value",
          tpe = WebComponentFieldType.String,
          description = "The value that will be included if the checkbox is submitted in a form.",
        ),
        Property(
          name = "reducedTouchTarget",
          tpe = WebComponentFieldType.Boolean,
          description =
            "When `true`, the checkbox remove padding for touchscreens and increase density. Note, the checkbox will no longer meet accessibility guidelines for touch.",
        ),
      ),
      events = Seq(
        Event(
          name = "change",
          description =
            "Fired when the user modifies the checkbox checked or indeterminate states from an input device interaction. Note that, like native <input>, the change event is not fired when the checked or indeterminate properties are set from JavaScript.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-checkbox-ink-color",
          description = "Color of mark inside a `checked` or `indeterminate` checkbox (enabled or disabled).",
        ),
        CSSProperty(
          name = "--mdc-checkbox-unchecked-color",
          description = "Color of the unchecked box.",
        ),
        CSSProperty(
          name = "--mdc-checkbox-disabled-color",
          description = "Color of the checkbox box and fill when disabled.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-circular-progress",
      description = "Progress indicators express an unspecified wait time or display the length of a process.",
      link =
        "https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress",
      npmPackage = NpmPackage(name = "@material/mwc-circular-progress", version = "0.18.0"),
      properties = Seq(
        Property(
          name = "indeterminate",
          tpe = WebComponentFieldType.Boolean,
          description = "Sets the circular-progress into its indeterminate state.",
        ),
        Property(
          name = "progress",
          tpe = WebComponentFieldType.Number,
          description = "Sets the progress bar's value. Value should be between [0, 1].",
        ),
        Property(
          name = "density",
          tpe = WebComponentFieldType.Number,
          description =
            "Sets the progress indicator's sizing based on density scale. Minimum value is `-8`. Each unit change in density scale corresponds to 4px change in side dimensions. The stroke width adjusts automatically.",
        ),
        Property(
          name = "closed",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Sets the progress indicator to the closed state. Sets content opacity to 0. Typically should be set to true when loading has finished.",
        ),
      ),
      methods = Seq(
        Method(
          name = "open",
          description = "Sets CircularProgress.closed to false",
        ),
        Method(
          name = "close",
          description = "Sets CircularProgress.closed to true",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-circular-progress-four-color",
      description = "Progress indicators express an unspecified wait time or display the length of a process.",
      link =
        "https://github.com/material-components/material-components-web-components/tree/master/packages/circular-progress-four-color",
      npmPackage = NpmPackage(name = "@material/mwc-circular-progress-four-color", version = "0.18.0"),
      properties = Seq(
        Property(
          name = "indeterminate",
          tpe = WebComponentFieldType.Boolean,
          description = "Sets the circular-progress into its indeterminate state.",
        ),
        Property(
          name = "progress",
          tpe = WebComponentFieldType.Number,
          description = "Sets the progress bar's value. Value should be between [0, 1].",
        ),
        Property(
          name = "density",
          tpe = WebComponentFieldType.Number,
          description =
            "Sets the progress indicator's sizing based on density scale. Minimum value is `-8`. Each unit change in density scale corresponds to 4px change in side dimensions. The stroke width adjusts automatically.",
        ),
        Property(
          name = "closed",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Sets the progress indicator to the closed state. Sets content opacity to 0. Typically should be set to true when loading has finished.",
        ),
      ),
      methods = Seq(
        Method(
          name = "open",
          description = "Sets CircularProgress.closed to false",
        ),
        Method(
          name = "close",
          description = "Sets CircularProgress.closed to true",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-circular-progress-bar-color-1",
          description = "Sets the first of the four rotating colors.",
        ),
        CSSProperty(
          name = "--mdc-circular-progress-bar-color-2",
          description = "Sets the second of the four rotating colors.",
        ),
        CSSProperty(
          name = "--mdc-circular-progress-bar-color-3",
          description = "Sets the third of the four rotating colors.",
        ),
        CSSProperty(
          name = "--mdc-circular-progress-bar-color-4",
          description = "Sets the last of the four rotating colors.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-dialog",
      description =
        "Dialogs inform users about a task and can contain critical information, require decisions, or involve multiple tasks.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/dialog",
      npmPackage = NpmPackage(name = "@material/mwc-dialog", version = "0.18.0"),
      slots = Slots(
        default = Some(DefaultSlot(description = "Content to display in the dialog's content area.")),
        named = Seq(
          NamedSlot(
            name = "primaryAction",
            description =
              "A focusable and clickable target. Typically a button such as <mwc-button>. Placed on the bottom right of the dialog (LTR) and above the secondary action when stacked. Automatically clicked when Enter key is pressed in the dialog.",
          ),
          NamedSlot(
            name = "secondaryAction",
            description =
              "A focusable and clickable target. Typically a button such as <mwc-button>. Placed immediately to the left of the primaryAction (LTR) or below when stacked.",
          ),
        ),
      ),
      properties = Seq(
        Property(
          name = "open",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether the dialog should open.",
        ),
        Property(
          name = "hideActions",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Hides the actions footer of the dialog. Needed to remove excess padding when no actions are slotted in.",
        ),
        Property(
          name = "stacked",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether to stack the action buttons.",
        ),
        Property(
          name = "heading",
          tpe = WebComponentFieldType.String,
          description = "Heading text of the dialog.",
        ),
        Property(
          name = "scrimClickAction",
          tpe = WebComponentFieldType.String,
          description =
            "_Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when the dialog closes because the scrim was clicked (see [actions section](#actions)).",
        ),
        Property(
          name = "escapeKeyAction",
          tpe = WebComponentFieldType.String,
          description =
            "_Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when the dialog closes because the excape key was pressed (see [actions section](#actions)).",
        ),
        Property(
          name = "defaultAction",
          tpe = WebComponentFieldType.String,
          description =
            "_Default: 'close'_ – Action to be emitted with the `closing` and `closed` events when `<mwc-dialog>.open` is toggled (see [actions section](#actions)).",
        ),
        Property(
          name = "actionAttribute",
          tpe = WebComponentFieldType.String,
          description =
            "_Default: 'dialogAction'_ – Attribute to read in light dom of dialog for closing action value (see [actions section](#actions)).",
        ),
        Property(
          name = "initialFocusAttribute",
          tpe = WebComponentFieldType.String,
          description =
            "_Default: 'dialogInitialFocus'_ – Attribute to search for in light dom for initial focus on dialog open.",
        ),
      ),
      methods = Seq(
        Method(
          name = "forceLayout",
          description =
            "Forces dialog to relayout (animation frame time). May be required if dialog size is incorrect or if stacked layout has not been triggered correctly.",
        ),
        Method(
          name = "focus",
          description = "Focuses on the initial focus element if defined (see [focus section](#focus)).",
        ),
        Method(name = "blur", description = "Blurs the active element."),
        Method(name = "show", description = "Opens the dialog."),
        Method(name = "close", description = "Closes the dialog."),
      ),
      events = Seq(
        Event(name = "opening", description = "Fired when the dialog is beginning to open."),
        Event(name = "opened", description = "Fired once the dialog is finished opening (after animation)."),
        Event(
          name = "closing",
          description =
            "Fired when the dialog is is beginning to close. Detail is the action that closed the dialog (see [actions section](#actions)).",
        ),
        Event(
          name = "closed",
          description =
            "Fired once the dialog is finished closing (after animation). Detail is the action that closed the dialog (see [actions section](#actions))",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-shape-medium",
          description = "Corner radius of the dialog surface.",
        ),
        CSSProperty(
          name = "--mdc-dialog-scrim-color",
          description =
            "Color of the scrim. (**Note:** setting alpha to 0 will still make scrim clickable but transparent).",
        ),
        CSSProperty(
          name = "--mdc-dialog-heading-ink-color",
          description = "Color of the heading text.",
        ),
        CSSProperty(
          name = "--mdc-dialog-content-ink-color",
          description =
            "Color applied to the projected content. (**Note:** it may also be possible to style the content via the light DOM since it is not encapsulated in a shadow root).",
        ),
        CSSProperty(
          name = "--mdc-dialog-scroll-divider-color",
          description = "Color of the dividers present when dialog is scrollable.",
        ),
        CSSProperty(
          name = "--mdc-dialog-min-width",
          description = "min-width ofthe dialog surface.",
        ),
        CSSProperty(
          name = "--mdc-dialog-max-width",
          description =
            "max-width of the dialog surface. (**Note:** if max-width is < `560px`, there is a visual jank bug that will occur causing the max width to be `560px` when the window is sized to <= than `560px`).",
        ),
        CSSProperty(
          name = "--mdc-dialog-max-height",
          description = "Max height of the dialog surface.",
        ),
        CSSProperty(
          name = "--mdc-dialog-box-shadow",
          description = "Sets the box shadow of the dialog.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-drawer",
      description =
        "The Navigation Drawer is used to organize access to destinations and other functionality on an app.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/drawer",
      npmPackage = NpmPackage(name = "@material/mwc-drawer", version = "0.18.0"),
      slots = Slots(
        default = Some(DefaultSlot(description = "Elements to display under the header in drawer.")),
        named = Seq(
          NamedSlot(name = "title", description = "Header title to display in the drawer when `hasHeader` is true."),
          NamedSlot(
            name = "subtitle",
            description = "Header subtitle to display in the drawer when `hasHeader` is true.",
          ),
          NamedSlot(name = "header", description = "Additional header elements to display in the drawer."),
          NamedSlot(
            name = "appContent",
            description = "Elements to display in the 'app content' to the right of, or under, the drawer.",
          ),
        ),
      ),
      properties = Seq(
        Property(
          name = "open",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether the dialog is open",
        ),
        Property(
          name = "hasHeader",
          tpe = WebComponentFieldType.Boolean,
          description = "When `true`, displays the `title`, `subtitle`, and `header` slots.",
        ),
        Property(
          name = "type",
          tpe = WebComponentFieldType.String,
          description =
            "When set to `'dismissible'`, overlays the drawer on the content. When set to `'modal'`, also adds a scrim when the drawer is open. When set to empty string, it is inlined with the page and displaces app content.",
        ),
      ),
      events = Seq(
        Event(
          name = "MDCDrawer:opened",
          description = "Fired when the drawer opens.",
        ),
        Event(
          name = "MDCDrawer:closed",
          description = "Fired when the drawer closes.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-drawer-width",
          description = "Width of the side drawer when opened.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-fab",
      description = "A floating action button (FAB) represents the primary action of a screen.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/fab",
      npmPackage = NpmPackage(name = "@material/mwc-fab", version = "0.18.0"),
      slots = Slots(
        default = None,
        named = Seq(
          NamedSlot(
            name = "icon",
            description =
              "An icon to be slotted into the fab. Note: the label property should still be set for button accessibility.",
          ),
        ),
      ),
      properties = Seq(
        Property(
          name = "icon",
          tpe = WebComponentFieldType.String,
          description = "The icon to display.",
        ),
        Property(
          name = "label",
          tpe = WebComponentFieldType.String,
          description =
            "The label to display when using the `extended` layout, and the `aria-label` attribute in all layouts.",
        ),
        Property(
          name = "mini",
          tpe = WebComponentFieldType.Boolean,
          description = "Modifies the FAB to be a smaller size, for use on smaller screens. Defaults to `false`.",
        ),
        Property(
          name = "reducedTouchTarget",
          tpe = WebComponentFieldType.Boolean,
          description = "Sets the minimum touch target of the default-sized mini fab to recommended 48x48px.",
        ),
        Property(
          name = "extended",
          tpe = WebComponentFieldType.Boolean,
          description = "Enable the *extended* layout which includes a text label. Defaults to `false`.",
        ),
        Property(
          name = "showIconAtEnd",
          tpe = WebComponentFieldType.Boolean,
          description =
            "When in the *extended* layout, position the icon after the label, instead of before. Defaults to `false`.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-icon-font",
          description = "Font to use for the icon.",
        ),
        CSSProperty(
          name = "--mdc-theme-on-secondary",
          description = "Foreground color of the label and icon.",
        ),
        CSSProperty(
          name = "--mdc-theme-secondary",
          description = "Background color of the FAB.",
        ),
        CSSProperty(
          name = "--mdc-fab-box-shadow",
          description =
            "Sets the box shadow of the fab. Elevation 6 when idle, 8 when focused or hovered, and 12 when active.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-formfield",
      description =
        "A form field is a text caption for MWC input elements including <mwc-checkbox>, <mwc-radio>, and <mwc-switch>. It is equivalent to the native <label> element in that it forwards user interaction events to the input element. For example, tapping on the label causes the associated input element to toggle and focus.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/formfield",
      npmPackage = NpmPackage(name = "@material/mwc-formfield", version = "0.18.0"),
      slots = Slots(
        default = Some(DefaultSlot(description = "The input element that this form field provides a label for.")),
        named = Seq(
        ),
      ),
      properties = Seq(
        Property(
          name = "label",
          tpe = WebComponentFieldType.String,
          description =
            "The text to display for the label and sets a11y label on input. (visually overriden by slotted label)",
        ),
        Property(
          name = "alignEnd",
          tpe = WebComponentFieldType.Boolean,
          description = "Align the component at the end of the label.",
        ),
        Property(
          name = "spaceBetween",
          tpe = WebComponentFieldType.Boolean,
          description = "Add space between the component and the label as the formfield grows.",
        ),
        Property(
          name = "nowrap",
          tpe = WebComponentFieldType.Boolean,
          description = "Prevents the label from wrapping and overflow text is ellipsed.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-icon-button-toggle",
      description =
        "Toggle buttons can be used to group related options. To emphasize groups of related toggle buttons, a group should share a common container.",
      link =
        "https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button-toggle",
      npmPackage = NpmPackage(name = "@material/mwc-icon-button-toggle", version = "0.18.0"),
      slots = Slots(
        default = None,
        named = Seq(
          NamedSlot(
            name = "onIcon",
            description = "Optional <img> or <svg> to display instead of using an icon font for the onIcon property.",
          ),
          NamedSlot(
            name = "offIcon",
            description = "Optional <img> or <svg> to display instead of using an icon font for the offIcon property.",
          ),
        ),
      ),
      properties = Seq(
        Property(
          name = "on",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether the toggle is activated.",
        ),
        Property(
          name = "onIcon",
          tpe = WebComponentFieldType.String,
          description = "Icon to display when `on` is `true`.",
        ),
        Property(
          name = "offIcon",
          tpe = WebComponentFieldType.String,
          description = "Icon to display when `on` is `false`.",
        ),
        Property(
          name = "label",
          tpe = WebComponentFieldType.String,
          description = "Accessible label for the button, sets `aria-label`.",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description = "Disabled buttons cannot be interacted with and have no visual interaction effect.",
        ),
      ),
      events = Seq(
        Event(
          name = "MDCIconButtonToggle:change",
          description = "Indicates the button has toggled. isOn indicates the on value of the toggle button.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-icon-font",
          description =
            "Font that supports *ligatures* and determines which icons are available (see [fonts](#fonts) above).",
        ),
        CSSProperty(
          name = "--mdc-theme-text-disabled-on-light",
          description = "Color of icon when `disabled` is `true`",
        ),
        CSSProperty(
          name = "--mdc-icon-button-ripple-opacity",
          description = "Opacity of the ripple on the icon button",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-icon-button",
      description = "Icon buttons allow users to take actions, and make choices, with a single tap.",
      link =
        "https://github.com/material-components/material-components-web-components/tree/master/packages/icon-button",
      npmPackage = NpmPackage(name = "@material/mwc-icon-button", version = "0.18.0"),
      slots = Slots(
        default = Some(DefaultSlot(description = "Optional <img> or <svg> to display instead of using an icon font")),
        named = Seq(
        ),
      ),
      properties = Seq(
        Property(
          name = "icon",
          tpe = WebComponentFieldType.String,
          description = "Icon to display, and `aria-label` value when `label` is not defined.",
        ),
        Property(
          name = "label",
          tpe = WebComponentFieldType.String,
          description = "Accessible label for the button, sets `aria-label`.",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description = "Disabled buttons cannot be interacted with and have no visual interaction effect.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-icon-font",
          description =
            "Font that supports *ligatures* and determines which icons are available (see [fonts](#fonts) above).",
        ),
        CSSProperty(
          name = "--mdc-icon-button-size",
          description = "Sets the size of the button wrapping the icon.",
        ),
        CSSProperty(
          name = "--mdc-icon-size",
          description = "Sets the size of the icon.",
        ),
        CSSProperty(
          name = "--mdc-theme-text-disabled-on-light",
          description = "Color of icon when `disabled` is `true`",
        ),
        CSSProperty(
          name = "--mdc-icon-button-ripple-opacity",
          description = "Opacity of the ripple on the icon button",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-icon",
      description =
        "Icon displays an icon with a chosen name from the [Material Icons](https://material.io/resources/icons/) font, or from any font that supports *ligatures*.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/icon",
      npmPackage = NpmPackage(name = "@material/mwc-icon", version = "0.18.0"),
      slots = Slots(
        default = Some(
          DefaultSlot(description =
            "The name of the icon to display (e.g. shopping_cart). See Material Icons for an index of all available icons.",
          ),
        ),
        named = Seq(
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-icon-font",
          description = "Font that supports ligatures and determines which icons are available (see fonts above).",
        ),
        CSSProperty(
          name = "--mdc-icon-size",
          description = "Size of the icon.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-linear-progress",
      description = "Progress indicators express an unspecified wait time or display the length of a process.",
      link =
        "https://github.com/material-components/material-components-web-components/tree/master/packages/linear-progress",
      npmPackage = NpmPackage(name = "@material/mwc-linear-progress", version = "0.18.0"),
      properties = Seq(
        Property(
          name = "indeterminate",
          tpe = WebComponentFieldType.Boolean,
          description = "Sets the linear-progress into its indeterminate state.",
        ),
        Property(
          name = "progress",
          tpe = WebComponentFieldType.Number,
          description = "Sets the primary progress bar's value. Value should be between [0, 1].",
        ),
        Property(
          name = "buffer",
          tpe = WebComponentFieldType.Number,
          description =
            "Sets the buffer progress bar's value. Value should be between [0, 1]. Setting this value to be less than 1 will reveal moving, buffering dots.",
        ),
        Property(
          name = "reverse",
          tpe = WebComponentFieldType.Boolean,
          description = "Reverses the direction of the linear progress indicator.",
        ),
        Property(
          name = "closed",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Sets the progress indicator to the closed state. Sets content opactiy to 0. Typically should be set to true when loading has finished.",
        ),
      ),
      methods = Seq(
        Method(
          name = "open",
          description = "Sets LinearProgress.closed to false",
        ),
        Method(
          name = "close",
          description = "Sets LinearProgress.closed to true",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-theme-primary",
          description = "Sets the color of primary progress bar.",
        ),
        CSSProperty(
          name = "--mdc-linear-progress-buffer-color",
          description =
            "Sets the color of the buffer progress bar.<br> **NOTE:** to change the color of the buffering dots, you must do so in the image of `--mdc-linear-progress-buffering-dots-image`.",
        ),
        CSSProperty(
          name = "--mdc-linear-progress-buffering-dots-image",
          description =
            "Sets the image to use as the buffering dots. This pattern is then repeated horizontally and animated.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-radio",
      description =
        "Radio buttons allow the user to select one option from a set. Use radio buttons when the user needs to see all available options.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/radio",
      npmPackage = NpmPackage(name = "@material/mwc-radio", version = "0.18.0"),
      properties = Seq(
        Property(
          name = "checked",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Whether this radio button is the currently-selected one in its group. Maps to the native [`checked`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio#checked) attribute.",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description =
            "If `true`, this radio button cannot be selected or de-selected. Maps to the native [`disabled`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#disabled) attribute.",
        ),
        Property(
          name = "name",
          tpe = WebComponentFieldType.String,
          description =
            "Name of the input for form submission, and identifier for the selection group. Only one radio button can be checked for a given selection group. Maps to the native [`name`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#name) attribute.",
        ),
        Property(
          name = "value",
          tpe = WebComponentFieldType.String,
          description =
            "Value of the input for form submission. Maps to the native [`value`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio#value) attribute.",
        ),
        Property(
          name = "global",
          tpe = WebComponentFieldType.Boolean,
          description =
            "If `true`, this radio button will use a global, document-level scope for its selection group rather than its local shadow root.",
        ),
      ),
      events = Seq(
        Event(
          name = "change",
          description =
            "Fired when the user modifies the radio checked state from an input device interaction on this radio. Note that, like native <input>, the change event is not fired when the checked property is set from JavaScript, nor is it fired when another radio in the same group becomes checked.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-radio-unchecked-color",
          description = "Color of the ring of an unchecked radio.",
        ),
        CSSProperty(
          name = "--mdc-radio-disabled-color",
          description = "Color of the ring and circle of a disabled radio.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-slider",
      description = "Sliders allow users to make selections from a range of values.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/slider",
      npmPackage = NpmPackage(name = "@material/mwc-slider", version = "0.18.0"),
      properties = Seq(
        Property(
          name = "value",
          tpe = WebComponentFieldType.Number,
          description = "Current value of the slider.",
        ),
        Property(
          name = "min",
          tpe = WebComponentFieldType.Number,
          description = "Minimum value of the slider.",
        ),
        Property(
          name = "max",
          tpe = WebComponentFieldType.Number,
          description = "Maximum value of the slider.",
        ),
        Property(
          name = "step",
          tpe = WebComponentFieldType.Number,
          description =
            "When defined, the slider will quantize (round to the nearest multiple) all values to match that step value, except for the minimum and maximum values, which can always be set. When 0, quantization is disabled.<br> **NOTE:** Throws when <0.",
        ),
        Property(
          name = "pin",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Shows the thumb pin on a discrete slider.<br> **NOTE:** Numbers displayed inside the slider will be rounded to at most 3 decimal digits.",
        ),
        Property(
          name = "markers",
          tpe = WebComponentFieldType.Boolean,
          description = "Shows the tick marks for each step on the track when the slider is discrete.",
        ),
      ),
      methods = Seq(
        Method(
          name = "layout",
          description =
            "Recomputes the dimensions and re-lays out the component. This should be called if the dimensions of the slider itself or any of its parent elements change programmatically (it is called automatically on resize and on mousedown / touchstart).",
        ),
      ),
      events = Seq(
        Event(
          name = "input",
          description =
            "Fired when the value changes due to user input. Similar to the input event of the native <input type=\"range\"> element, the input event will not fire when value is modified via JavaScript.",
        ),
        Event(
          name = "change",
          description =
            "Fired when the value changes and the user has finished interacting with the slider. Similar to the change event of the native <input type=\"range\"> element, the change event will not fire when value is modified via JavaScript.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-theme-secondary",
          description = "Sets the color of the knob and filled track when slider is active.",
        ),
        CSSProperty(
          name = "--mdc-theme-text-primary-on-dark",
          description = "Sets the color of the text in the pin.",
        ),
        CSSProperty(
          name = "--mdc-slider-bg-color-behind-component",
          description =
            "Sets the color of the circle around the knob on the disabled slider to make it seem cut-out. May be necessary when placing a disabled slider on a different-colored background.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-snackbar",
      description = "Snackbars provide brief messages about app processes at the bottom of the screen.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/snackbar",
      npmPackage = NpmPackage(name = "@material/mwc-snackbar", version = "0.18.0"),
      slots = Slots(
        default = None,
        named = Seq(
          NamedSlot(
            name = "action",
            description = "Optional <mwc-button> which closes the snackbar with reason 'action'.",
          ),
          NamedSlot(
            name = "dismiss",
            description = "Optional <mwc-icon-button> which closes the snackbar with reason 'dismiss'.",
          ),
        ),
      ),
      properties = Seq(
        Property(
          name = "open",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether the snackbar is currently open.",
        ),
        Property(
          name = "timeoutMs",
          tpe = WebComponentFieldType.Number,
          description =
            "Automatic dismiss timeout in milliseconds. Value must be between `4000` and `10000`  (or `-1` to disable the timeout completely) or an error will be thrown. Defaults to `5000` (5 seconds).",
        ),
        Property(
          name = "closeOnEscape",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Whether the snackbar closes when it is focused and the user presses the ESC key. Defaults to `true`.",
        ),
        Property(
          name = "labelText",
          tpe = WebComponentFieldType.String,
          description = "The text content of the label element.",
        ),
        Property(
          name = "stacked",
          tpe = WebComponentFieldType.Boolean,
          description = "Enables the *stacked* layout (see above).",
        ),
        Property(
          name = "leading",
          tpe = WebComponentFieldType.Boolean,
          description = "Enables the *leading* layout (see above).",
        ),
      ),
      methods = Seq(
        Method(
          name = "show",
          description = "Opens the snackbar.",
        ),
        Method(
          name = "close",
          description = "Closes the snackbar, optionally with the specified reason indicating why it was closed.",
        ),
      ),
      events = Seq(
        Event(
          name = "MDCSnackbar:opening",
          description = "Indicates when the snackbar begins its opening animation.",
        ),
        Event(
          name = "MDCSnackbar:opened",
          description = "Indicates when the snackbar finishes its opening animation.",
        ),
        Event(
          name = "MDCSnackbar:closing",
          description =
            "Indicates when the snackbar begins its closing animation. reason contains the reason why the snackbar closed ('dismiss', 'action', or a custom string via the close method).",
        ),
        Event(
          name = "MDCSnackbar:closed",
          description =
            "Indicates when the snackbar finishes its closing animation. reason contains the reason why the snackbar closed ('dismiss', 'action', or a custom string via the close method).",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-snackbar-action-color",
          description = "Color of the action button text.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-switch",
      description =
        "Switches toggle the state of a single setting on or off. They are the preferred way to adjust settings on mobile.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/switch",
      npmPackage = NpmPackage(name = "@material/mwc-switch", version = "0.18.0"),
      properties = Seq(
        Property(
          name = "checked",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether or not the switch should be checked / activated.",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description = "Disables the input and sets the disabled styles.",
        ),
      ),
      events = Seq(
        Event(
          name = "change",
          description =
            "Fired when the user modifies the switch checked state from an input device interaction. Note that, like native <input>, the change event is not fired when the checked property is set from JavaScript.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-tab-bar",
      description = "Tabs organize content across different screens, data sets, and other interactions.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar",
      npmPackage = NpmPackage(name = "@material/mwc-tab-bar", version = "0.18.0"),
      slots = Slots(
        default = Some(DefaultSlot(description = "mwc-tab elements to display.")),
        named = Seq(
        ),
      ),
      properties = Seq(
        Property(
          name = "activeIndex",
          tpe = WebComponentFieldType.Number,
          description = "Index of tab that is active.",
        ),
      ),
      methods = Seq(
        Method(
          name = "scrollIndexIntoView",
          description = "For long, scrollable tab-bars, scrolls the tab at the given index into view.",
        ),
      ),
      events = Seq(
        Event(
          name = "MDCTabBar:activated",
          description = "Emitted when a tab selection has been made.",
        ),
      ),
      subComponents = Seq(
        WebComponent(
          tag = "mwc-tab",
          description = "Tabs organize content across different screens, data sets, and other interactions.",
          link = "https://github.com/material-components/material-components-web-components/tree/master/packages/tab",
          npmPackage = NpmPackage(name = "@material/mwc-tab", version = "0.18.0"),
          slots = Slots(
            default = None,
            named = Seq(
              NamedSlot(
                name = "icon",
                description = "Slotted icon to display. Only available if hasImageIcon or icon are defined.",
              ),
            ),
          ),
          properties = Seq(
            Property(
              name = "label",
              tpe = WebComponentFieldType.String,
              description = "Text label to display in tab.",
            ),
            Property(
              name = "icon",
              tpe = WebComponentFieldType.String,
              description = "Material design icon name to display (overridden by slotted icon).",
            ),
            Property(
              name = "hasImageIcon",
              tpe = WebComponentFieldType.Boolean,
              description = "Displays a slot to show an image icon.",
            ),
            Property(
              name = "indicatorIcon",
              tpe = WebComponentFieldType.String,
              description = "Material design icon name to display as the indicator.",
            ),
            Property(
              name = "isFadingIndicator",
              tpe = WebComponentFieldType.Boolean,
              description = "Indicator fades in and out instead of sliding.",
            ),
            Property(
              name = "minWidth",
              tpe = WebComponentFieldType.Boolean,
              description = "Shrinks tab as narrow as possible without causing text to wrap.",
            ),
            Property(
              name = "isMinWidthIndicator",
              tpe = WebComponentFieldType.Boolean,
              description = "Shrinks indicator to be the size of the content.",
            ),
            Property(
              name = "stacked",
              tpe = WebComponentFieldType.Boolean,
              description = "Stacks icon on top of label text.",
            ),
            Property(
              name = "active",
              tpe = WebComponentFieldType.Any,
              description = "Indicates whether the tab's indicator is active.",
            ),
          ),
          methods = Seq(
            Method(name = "activate", description = "Activates the indicator."),
            Method(name = "deactivate", description = "Deactivates the indicator."),
            Method(name = "computeDimensions()", description = "Computes the dimensions of the content."),
            Method(name = "computeIndicatorClientRect", description = "Computes the dimensions of the indicator."),
          ),
          events = Seq(
            Event(
              name = "MDCTab:interacted",
              description =
                "Emitted when the Tab is interacted with, regardless of its active state. Used by parent components to know which Tab to activate.",
            ),
          ),
          cssProperties = Seq(
            CSSProperty(name = "--mdc-tab-height", description = "Height of the tab."),
            CSSProperty(
              name = "--mdc-tab-horizontal-padding",
              description = "Horizontal padding on either side of the tab.",
            ),
            CSSProperty(name = "--mdc-tab-stacked-height", description = "Height of the tab's stacked variant."),
            CSSProperty(
              name = "--mdc-tab-text-label-color-default",
              description = "Color of an unactivated tab label.",
            ),
            CSSProperty(name = "--mdc-tab-color-default", description = "Color of an unactivated icon."),
          ),
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-list",
      description = "Lists are continuous, vertical indexes of text or images.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/tab-bar",
      npmPackage = NpmPackage(name = "@material/mwc-list", version = "0.18.0"),
      slots = Slots(
        default = Some(DefaultSlot(description = "Content to display in the lists internal <ul> element.")),
        named = Seq(
        ),
      ),
      properties = Seq(
        Property(
          name = "activatable",
          tpe = WebComponentFieldType.Boolean,
          description = "Sets `activated` attribute on selected items which provides a focus-persistent highlight.",
        ),
        Property(
          name = "rootTabbable",
          tpe = WebComponentFieldType.Boolean,
          description = "When `true`, sets `tabindex=\"0\"` on the internal list. Otherwise sets `tabindex=\"-1\"`.",
        ),
        Property(
          name = "multi",
          tpe = WebComponentFieldType.Boolean,
          description =
            "When `true`, enables selection of multiple items. This will result in `index` being of type `Set<number>` and selected returning `ListItemBase[]`.",
        ),
        Property(
          name = "wrapFocus",
          tpe = WebComponentFieldType.Boolean,
          description =
            "When `true`, pressing `up` on the keyboard when focused on the first item will focus the last item and `down` when focused on the last item will focus the first item.",
        ),
        Property(
          name = "itemRoles",
          tpe = WebComponentFieldType.String,
          description = "Determines what `role` attribute to set on all list items.",
        ),
        Property(
          name = "innerRole",
          tpe = WebComponentFieldType.String,
          description = "Role of the internal `<ul>` element.",
        ),
        Property(
          name = "noninteractive",
          tpe = WebComponentFieldType.Boolean,
          description =
            "When `true`, disables focus and pointer events (thus ripples) on the list. Used for display-only lists.",
        ),
        Property(
          name = "items",
          tpe = WebComponentFieldType.Any,
          description =
            "All list items that are available for selection. Eligible items have the `[mwc-list-item]` attribute which `ListItemBase` applies automatically.",
        ),
        Property(
          name = "selected",
          tpe = WebComponentFieldType.Any,
          description =
            "Currently-selected list item(s). When `multi` is `true`, `selected` is of type `ListItemBase[]` and when `false`, `selected` is of type `ListItemBase`. `selected` is `null` when no item is selected.",
        ),
        Property(
          name = "index",
          tpe = WebComponentFieldType.Any,
          description =
            "Index / indices of selected item(s). When `multi` is `true`, `index` is of type `number` and when `false`, `index` is of type `Set<number>`. Unset indicies are `-1` and empty `Set<number>` for single and multi selection respectively.",
        ),
      ),
      methods = Seq(
        Method(name = "select", description = "Selects the elements at the given index / indices."),
        Method(
          name = "toggle",
          description =
            "Toggles the selected index, and forcibly selects or deselects the value of `force` if attribtue is provided.",
        ),
        Method(
          name = "getFocusedItemIndex",
          description = "Returns the index of the currently-focused item. `-1` if none are focused.",
        ),
        Method(
          name = "focusItemAtIndex",
          description = "Focuses the item at the given index and manages tabindex on all other items.",
        ),
        Method(
          name = "layout",
          description =
            "Resets tabindex on all items and will update items model if provided true. It may be required to call layout if selectability of an element is dynamically changed. e.g. `[mwc-list-item]` attribute is removed from a list item or `noninteractive` is dynamically set on a list item.",
        ),
      ),
      events = Seq(
        Event(
          name = "action",
          description = "Fired when a selection has been made via click or keyboard aciton.",
        ),
        Event(
          name = "selected",
          description =
            "Fired when a selection has been made. index is the selected index (will be of type Set<number> if multi and number if single), and diff (of type IndexDiff**) represents the diff of added and removed indices from previous selection.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-list-vertical-padding",
          description = "Padding before and after the first and last list items.",
        ),
        CSSProperty(
          name = "--mdc-list-side-padding",
          description = "Adjusts the padding of the [padded] list dividers (also propagates to mwc-list-item).",
        ),
        CSSProperty(
          name = "--mdc-list-inset-margin",
          description =
            "Adjusts the left inset padding of an [inset] list divider. Typically used for dividing list items with icons.",
        ),
      ),
      subComponents = Seq(
        WebComponent(
          tag = "mwc-list-item",
          description = "List item",
          link = "https://github.com/material-components/material-components-web-components/tree/master/packages/list",
          npmPackage = NpmPackage(name = "@material/mwc-list/mwc-list-item", version = "0.18.0"),
          slots = Slots(
            default = Some(
              DefaultSlot(description =
                "Primary text to display in the list item. Note, text must be wrapped in an inline node to be styled for disabled variant.",
              ),
            ),
            named = Seq(
              NamedSlot(
                name = "graphic",
                description = "First tile graphic to display when graphic attribute is defined.",
              ),
              NamedSlot(
                name = "meta",
                description = "Last tile meta icon or text to display when hasMeta is true.",
              ),
              NamedSlot(
                name = "secondary",
                description = "Secondary text displayed below primary text of a two-line list item.",
              ),
            ),
          ),
          properties = Seq(
            Property(
              name = "value",
              tpe = WebComponentFieldType.String,
              description = "Value associated with this list item (used by mwc-select).",
            ),
            Property(
              name = "group",
              tpe = WebComponentFieldType.String,
              description =
                "Used to group items together (used by mwc-menu for menu selection groups and mwc-radio-list-element).",
            ),
            Property(
              name = "tabindex",
              tpe = WebComponentFieldType.Number,
              description = "Reflects tabindex and sets internal tab indices.",
            ),
            Property(
              name = "disabled",
              tpe = WebComponentFieldType.Boolean,
              description = "Reflects disabled and sets internal disabled attributes.",
            ),
            Property(
              name = "twoline",
              tpe = WebComponentFieldType.Boolean,
              description = "Activates the two-line variant and enables the secondary slot.",
            ),
            Property(
              name = "activated",
              tpe = WebComponentFieldType.Boolean,
              description = "Activates focus-persistent ripple.",
            ),
            Property(
              name = "graphic",
              tpe = WebComponentFieldType.Any,
              description = "Determines which graphic layout to show and enables the graphic slot.",
            ),
            Property(
              name = "multipleGraphics",
              tpe = WebComponentFieldType.Boolean,
              description = "Allows arbitrary width for multiple slotted graphics.",
            ),
            Property(
              name = "hasMeta",
              tpe = WebComponentFieldType.Boolean,
              description = "Activates the meta layout tile and enables the meta slot.",
            ),
            Property(
              name = "noninteractive",
              tpe = WebComponentFieldType.Boolean,
              description = "Disables focus and pointer events for the list item.",
            ),
            Property(
              name = "selected",
              tpe = WebComponentFieldType.Boolean,
              description = "Denotes that the list item is selected.",
            ),
            Property(
              name = "text",
              tpe = WebComponentFieldType.String,
              description = "Trimmed textContent of the list item.",
            ),
          ),
          events = Seq(
            Event(
              name = "request-selected",
              description =
                "Fired upon click and when selected property is changed. Requests selection from the mwc-list.",
            ),
          ),
          cssProperties = Seq(
            CSSProperty(
              name = "--mdc-list-item-meta-size",
              description = "Line height of the meta icon or text and width & height of the slotted parent wrapper.",
            ),
            CSSProperty(
              name = "--mdc-list-item-graphic-size",
              description =
                "Line height of the graphic and width & height of the slotted parent wrapper. 24px when graphic is \"icon\". 40px when graphic is \"avatar\". 56px when graphic is \"medium\", and \"large\".",
            ),
            CSSProperty(
              name = "--mdc-list-item-graphic-margin",
              description =
                "Margin between the text and graphic. 16px when graphic is \"avatar\", \"medium\", \"large\", and \"control\". 32px when graphic is \"icon\".",
            ),
          ),
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-menu",
      description = "Menus display a list of choices on temporary surfaces.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/menu",
      npmPackage = NpmPackage(name = "@material/mwc-menu", version = "0.18.0"),
      slots = Slots(
        default = Some(DefaultSlot(description = "Content to display in the menus internal <mwc-list> element.")),
        named = Seq(
        ),
      ),
      properties = Seq(
        Property(
          name = "open",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether the menu should open and display.",
        ),
        Property(
          name = "anchor",
          tpe = WebComponentFieldType.Any,
          description =
            "Determines from which element the floating menu should calculate sizing and position offsets. In the default case, both mwc-menu and the anchor should share a parent with position:relative. Changing anchor typically requires absolute or fixed.",
        ),
        Property(
          name = "corner",
          tpe = WebComponentFieldType.String,
          description = "Corner of the anchor from which the menu should position itself.",
        ),
        Property(
          name = "menuCorner",
          tpe = WebComponentFieldType.String,
          description =
            "Horizontal corner of the menu from which the menu should position itself. **NOTE:** Only horizontal corners are supported.",
        ),
        Property(
          name = "quick",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether to skip the opening animation.",
        ),
        Property(
          name = "absolute",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Makes the menu's position absolute which will be relative to whichever ancestor has position:relative. Setting x and y will modify the menu's left and top. Setting anchor will attempt to position the menu to the anchor.",
        ),
        Property(
          name = "fixed",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Makes the menu's position fixed which will be relative to the window. Setting x and y will modify the menu's left and top. Setting anchor will attempt to position the menu to the anchor's immediate position before opening.",
        ),
        Property(
          name = "x",
          tpe = WebComponentFieldType.Number,
          description =
            "Sets horizontal position when absolute or fixed. When given an anchor, sets horizontal position relative to anchor at given corner. Requires y not to be null.",
        ),
        Property(
          name = "y",
          tpe = WebComponentFieldType.Number,
          description =
            "Sets vertical position when absolute or fixed. When given an anchor, sets vertical position relative to anchor at given corner. Requires x not to be null.",
        ),
        Property(
          name = "forceGroupSelection",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Forces a menu group to have a selected item by preventing deselection of menu items in menu groups via user interaction.",
        ),
        Property(
          name = "defaultFocus",
          tpe = WebComponentFieldType.String,
          description = "Item to focus upon menu open.",
        ),
        Property(name = "fullwidth", tpe = WebComponentFieldType.Boolean, description = "Sets surface width to 100%."),
        Property(
          name = "wrapFocus",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) wrapFocus property.",
        ),
        Property(name = "innerRole", tpe = WebComponentFieldType.Any, description = "menu"),
        Property(
          name = "multi",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) multi property.",
        ),
        Property(
          name = "activatable",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) activatable property.",
        ),
        Property(
          name = "items",
          tpe = WebComponentFieldType.Any,
          description =
            "Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) items property.",
        ),
        Property(
          name = "index",
          tpe = WebComponentFieldType.Any,
          description =
            "Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) index property.",
        ),
        Property(
          name = "selected",
          tpe = WebComponentFieldType.Any,
          description =
            "Proxies to [mwc-list's](https://github.com/material-components/material-components-web-components/tree/master/packages/list#mwc-list-1) selected property.",
        ),
      ),
      methods = Seq(
        Method(name = "show", description = " Sets `open` to false."),
        Method(name = "close", description = " Sets `open` to true."),
        Method(name = "select", description = " Selects the elements at the given index / indices."),
        Method(
          name = "getFocusedItemIndex",
          description = " Returns the index of the currently-focused item. `-1` if none are focused.",
        ),
        Method(
          name = "focusItemAtIndex",
          description = " Focuses the item at the given index and manages tabindex on all other items.",
        ),
        Method(
          name = "layout",
          description =
            " Resets tabindex on all items and will update `items` model if provided true. It may be required to call layout if selectability of an element is dynamically changed. e.g. `[mwc-list-item]` attribute is removed from a list item or `noninteractive` is dynamically set on a list item.",
        ),
      ),
      events = Seq(
        Event(name = "opened", description = "Fired when opened."),
        Event(name = "closed", description = "Fired when closed."),
        Event(name = "action", description = "Fired when a selection has been made via click or keyboard aciton."),
        Event(
          name = "selected",
          description =
            "Fired when a selection has been made. `index` is the selected index (will be of type `Set<number>` if multi and `number` if single), and `diff` (of type `IndexDiff`**) represents the diff of added and removed indices from previous selection.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(name = "--mdc-shape-medium", description = "Border radius of the dropdown."),
        CSSProperty(name = "--mdc-menu-item-height", description = "Height of single-line list-items in the menu."),
        CSSProperty(name = "--mdc-menu-min-width", description = "Menu min-width."),
        CSSProperty(name = "--mdc-menu-max-width", description = "Menu max-width."),
        CSSProperty(name = "--mdc-menu-max-height", description = "Menu max height."),
        CSSProperty(name = "--mdc-menu-z-index", description = "Z-index of the popup menu surface."),
        CSSProperty(name = "--mdc-theme-surface", description = "Color of the menu surface."),
      ),
    ),
    WebComponent(
      tag = "mwc-textfield",
      description = "Text fields let users enter and edit text.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/textfield",
      npmPackage = NpmPackage(name = "@material/mwc-textfield", version = "0.18.0"),
      properties = Seq(
        Property(name = "value", tpe = WebComponentFieldType.String, description = "The input control's value."),
        Property(
          name = "type",
          tpe = WebComponentFieldType.String,
          description = "A string specifying the type of control to render.",
        ),
        Property(name = "label", tpe = WebComponentFieldType.String, description = "Sets floating label value."),
        Property(
          name = "placeholder",
          tpe = WebComponentFieldType.String,
          description = "Sets disappearing input placeholder.",
        ),
        Property(
          name = "prefix",
          tpe = WebComponentFieldType.String,
          description = "Prefix text to display before the input.",
        ),
        Property(
          name = "suffix",
          tpe = WebComponentFieldType.String,
          description = "Suffix text to display after the input.",
        ),
        Property(
          name = "icon",
          tpe = WebComponentFieldType.String,
          description =
            "Leading icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).",
        ),
        Property(
          name = "iconTrailing",
          tpe = WebComponentFieldType.String,
          description =
            "Trailing icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether or not the input should be disabled.",
        ),
        Property(
          name = "charCounter",
          tpe = WebComponentFieldType.Boolean,
          description = "**Note: requries maxLength to be set.** Display character counter with max length.",
        ),
        Property(
          name = "outlined",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether or not to show the material outlined variant.",
        ),
        Property(
          name = "helper",
          tpe = WebComponentFieldType.String,
          description = "Helper text to display below the input. Display default only when focused.",
        ),
        Property(
          name = "helperPersistent",
          tpe = WebComponentFieldType.Boolean,
          description = "Always show the helper text despite focus.",
        ),
        Property(
          name = "required",
          tpe = WebComponentFieldType.Boolean,
          description = "Displays error state if value is empty and input is blurred.",
        ),
        Property(
          name = "maxLength",
          tpe = WebComponentFieldType.Number,
          description = "Maximum length to accept input.",
        ),
        Property(
          name = "validationMessage",
          tpe = WebComponentFieldType.String,
          description =
            "Message to show in the error color when the textfield is invalid. (Helper text will not be visible)",
        ),
        Property(
          name = "pattern",
          tpe = WebComponentFieldType.String,
          description =
            "[HTMLInputElement.prototype.pattern](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)",
        ),
        Property(
          name = "min",
          tpe = WebComponentFieldType.String,
          description =
            "[HTMLInputElement.prototype.min](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)",
        ),
        Property(
          name = "max",
          tpe = WebComponentFieldType.String,
          description =
            "[HTMLInputElement.prototype.max](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (empty string will unset attribute)",
        ),
        Property(
          name = "size",
          tpe = WebComponentFieldType.Number,
          description =
            "[HTMLInputElement.prototype.Size](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefsize) (null will unset attribute)",
        ),
        Property(
          name = "step",
          tpe = WebComponentFieldType.Number,
          description =
            "[HTMLInputElement.prototype.Step](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation#Validation-related_attributes) (null will unset attribute)",
        ),
        Property(
          name = "autoValidate",
          tpe = WebComponentFieldType.Boolean,
          description = "Reports validity on input rather than only on blur.",
        ),
        Property(
          name = "validity",
          tpe = WebComponentFieldType.Any,
          description =
            "The [ValidityState](https://developer.mozilla.org/en-US/docs/Web/API/ValidityState) of the textfield.",
        ),
        Property(
          name = "willValidate",
          tpe = WebComponentFieldType.Boolean,
          description =
            "[HTMLInputElement.prototype.willValidate](https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement#Properties)",
        ),
        Property(
          name = "validityTransform",
          tpe = WebComponentFieldType.Any,
          description =
            "Callback called before each validation check. See the [validation section](#Validation) for more details.",
        ),
        Property(
          name = "validateOnInitialRender",
          tpe = WebComponentFieldType.Boolean,
          description = "Runs validation check on initial render.",
        ),
        Property(
          name = "name",
          tpe = WebComponentFieldType.String,
          description = "Sets the name attribute on the internal input.",
        ),
      ),
      methods = Seq(
        Method(
          name = "checkValidity",
          description =
            "Returns true if the textfield passes validity checks. Returns false and fires an invalid event on the textfield otherwise. NOTE: When accessing any property or function that checks validity at textfield initial boot up, you may have to await <mwc-textfield>.updateComplete.",
        ),
        Method(
          name = "reportValidity",
          description =
            "Runs checkValidity() method, and if it returns false, then it reports to the user that the input is invalid.",
        ),
        Method(
          name = "setCustomValidity",
          description =
            "Sets a custom validity message (also overwrites validationMessage). If this message is not the empty string, then the element is suffering from a custom validity error and does not validate.",
        ),
        Method(name = "select", description = "Selects the element at the given index."),
        Method(
          name = "layout",
          description =
            "Re-calculate layout. If a textfield is styled with display:none before it is first rendered, and it has a label that is floating, then you must call layout() the first time you remove display:none, or else the notch surrounding the label will not render correctly.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-text-field-filled-border-radius",
          description = "Border radius of the standard / filled textfield's background filling.",
        ),
        CSSProperty(
          name = "--mdc-text-field-idle-line-color",
          description = "Color of the filled textfield's bottom line when idle.",
        ),
        CSSProperty(
          name = "--mdc-text-field-hover-line-color",
          description = "Color of the filled textfield's bottom line when hovering.",
        ),
        CSSProperty(
          name = "--mdc-text-field-disabled-line-color",
          description = "Color of the filled textfield's bottom line when disabled.",
        ),
        CSSProperty(
          name = "--mdc-text-field-outlined-idle-border-color",
          description = "Color of the outlined textfield'soutline when idle.",
        ),
        CSSProperty(
          name = "--mdc-text-field-outlined-hover-border-color",
          description = "Color of the outlined textfield's outline when hovering.",
        ),
        CSSProperty(
          name = "--mdc-text-field-outlined-disabled-border-color",
          description = "Color of the outlined textfield's outline when disabled.",
        ),
        CSSProperty(
          name = "--mdc-text-field-fill-color",
          description = "Color of the textfield's background fill (non-outlined).",
        ),
        CSSProperty(
          name = "--mdc-text-field-disabled-fill-color",
          description = "Color of the textfield's background fill (non-outlined) when disabled.",
        ),
        CSSProperty(name = "--mdc-text-field-ink-color", description = "Color of the input text."),
        CSSProperty(
          name = "--mdc-text-field-label-ink-color",
          description = "Color of the non-focused floating label, helper text, char counter, and placeholder.",
        ),
        CSSProperty(
          name = "--mdc-text-field-disabled-ink-color",
          description =
            "Color of the input text, the floating label, helper text, char counter, and placeholder of a disabled textfield.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-textarea",
      description = "Text areas let users enter and edit text.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/textarea",
      npmPackage = NpmPackage(name = "@material/mwc-textarea", version = "0.18.0"),
      properties = Seq(
        Property(name = "rows", tpe = WebComponentFieldType.Number, description = "Sets number of visible text lines."),
        Property(
          name = "cols",
          tpe = WebComponentFieldType.Number,
          description = "Sets the visible width of the textarea.",
        ),
        Property(name = "value", tpe = WebComponentFieldType.String, description = "The input control's value."),
        Property(
          name = "type",
          tpe = WebComponentFieldType.String,
          description = "A string specifying the type of control to render.",
        ),
        Property(name = "label", tpe = WebComponentFieldType.String, description = "Sets floating label value."),
        Property(
          name = "placeholder",
          tpe = WebComponentFieldType.String,
          description = "Sets disappearing input placeholder.",
        ),
        Property(
          name = "icon",
          tpe = WebComponentFieldType.String,
          description =
            "Leading icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).",
        ),
        Property(
          name = "iconTrailing",
          tpe = WebComponentFieldType.String,
          description =
            "Trailing icon to display in input. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon).",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether or not the input should be disabled.",
        ),
        Property(
          name = "charCounter",
          tpe = WebComponentFieldType.Boolean,
          description =
            "**Note: requires maxLength to be set.** Display character counter with max length. Textareas may display an \"external\" or \"internal\" charCounter. When true, textareas display an external character counter by default.",
        ),
        Property(
          name = "outlined",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether or not to show the material outlined variant.",
        ),
        Property(
          name = "helper",
          tpe = WebComponentFieldType.String,
          description = "Helper text to display below the input. Display default only when focused.",
        ),
        Property(
          name = "helperPersistent",
          tpe = WebComponentFieldType.Boolean,
          description = "Always show the helper text despite focus.",
        ),
        Property(
          name = "required",
          tpe = WebComponentFieldType.Boolean,
          description = "Displays error state if value is empty and input is blurred.",
        ),
        Property(
          name = "maxLength",
          tpe = WebComponentFieldType.Number,
          description = "Maximum length input to accept.",
        ),
        Property(
          name = "validationMessage",
          tpe = WebComponentFieldType.String,
          description =
            "Message to show in the error color when the textarea is invalid. (Helper text will not be visible)",
        ),
        Property(
          name = "validity",
          tpe = WebComponentFieldType.Any,
          description =
            "The [ValidityState](https://developer.mozilla.org/en-US/docs/Web/API/ValidityState) of the textfield.",
        ),
        Property(
          name = "willValidate",
          tpe = WebComponentFieldType.Boolean,
          description =
            "[HTMLInputElement.prototype.willValidate](https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement#Properties)",
        ),
        Property(
          name = "validityTransform",
          tpe = WebComponentFieldType.Any,
          description =
            "Callback called before each validation check. See the [validation section](#Validation) for more details.",
        ),
        Property(
          name = "validateOnInitialRender",
          tpe = WebComponentFieldType.Boolean,
          description = "Runs validation check on initial render.",
        ),
        Property(
          name = "ame",
          tpe = WebComponentFieldType.String,
          description = "Sets the name attribute on the internal textarea.",
        ),
      ),
      methods = Seq(
        Method(
          name = "checkValidity",
          description =
            "Returns true if the textarea passes validity checks. Returns false and fires an invalid event on the textarea otherwise.",
        ),
        Method(
          name = "reportValidity",
          description =
            "Runs checkValidity() method, and if it returns false, then it reports to the user that the input is invalid.",
        ),
        Method(
          name = "setCustomValidity",
          description =
            "Sets a custom validity message (also overwrites validationMessage). If this message is not the empty string, then the element is suffering from a custom validity error and does not validate.",
        ),
        Method(name = "select", description = "Selects the element at the given index."),
        Method(
          name = "layout",
          description =
            "Re-calculate layout. If a textarea is styled with display:none before it is first rendered, and it has a label that is floating, then you must call layout() the first time you remove display:none, or else the notch surrounding the label will not render correctly.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-text-area-filled-border-radius",
          description = "Border radius of the standard / filled textarea's background filling.",
        ),
        CSSProperty(
          name = "--mdc-text-area-outlined-idle-border-color",
          description = "Color of the outlined textarea's  outline when idle.",
        ),
        CSSProperty(
          name = "--mdc-text-area-outlined-hover-border-color",
          description = "Color of the outlined textarea's outline when hovering.",
        ),
        CSSProperty(
          name = "--mdc-text-area-outlined-disabled-border-color",
          description = "Color of the outlined textarea's outline when disabled.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-select",
      description = "Selects display a list of choices on temporary surfaces.",
      link = "https://github.com/material-components/material-components-web-components/tree/master/packages/select",
      npmPackage = NpmPackage(name = "@material/mwc-select", version = "0.18.0"),
      slots = Slots(
        default = Some(DefaultSlot(description = "Content to display in the selects internal <mwc-menu> element.")),
        named = Seq(
        ),
      ),
      properties = Seq(
        Property(
          name = "value",
          tpe = WebComponentFieldType.String,
          description =
            "The select control's value determined by the value property of the currently selected list item. Setting value will attempt to select a list-item with the same value. If one does not match, it will set itself to \"\" and the index to -1. Setting value before the list item is attached will not select the item.",
        ),
        Property(
          name = "label",
          tpe = WebComponentFieldType.String,
          description =
            "Sets floating label value. __NOTE:__ The label will not float if the selected item has a falsey value property.",
        ),
        Property(
          name = "naturalMenuWidth",
          tpe = WebComponentFieldType.String,
          description = "Sets the dropdown menu's width to auto.",
        ),
        Property(
          name = "icon",
          tpe = WebComponentFieldType.String,
          description =
            "Leading icon to display in select. See [mwc-icon](https://github.com/material-components/material-components-web-components/tree/master/packages/icon). _Note_: for proper list spacing, each list item must have graphic=\"icon\" or graphic=\"avatar\" to be set.",
        ),
        Property(
          name = "disabled",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether or not the select should be disabled.",
        ),
        Property(
          name = "outlined",
          tpe = WebComponentFieldType.Boolean,
          description = "Whether or not to show the material outlined variant.",
        ),
        Property(
          name = "helper",
          tpe = WebComponentFieldType.String,
          description = "Helper text to display below the select. Display default only when focused.",
        ),
        Property(
          name = "helperPersistent",
          tpe = WebComponentFieldType.Boolean,
          description = "Always show the helper text despite focus.",
        ),
        Property(
          name = "required",
          tpe = WebComponentFieldType.Boolean,
          description = "Displays error state if value is empty and select is blurred.",
        ),
        Property(
          name = "validationMessage",
          tpe = WebComponentFieldType.String,
          description =
            "Message to show in the error color when the select is invalid. (Helper text will not be visible)",
        ),
        Property(name = "selected", tpe = WebComponentFieldType.Any, description = "Selected list item element."),
        Property(name = "items", tpe = WebComponentFieldType.Any, description = "List of selectable items."),
        Property(name = "index", tpe = WebComponentFieldType.Number, description = "Index of selected list item."),
        Property(
          name = "validity",
          tpe = WebComponentFieldType.Any,
          description =
            "The [ValidityState](https://developer.mozilla.org/en-US/docs/Web/API/ValidityState) of the select.",
        ),
        Property(
          name = "validityTransform",
          tpe = WebComponentFieldType.Any,
          description =
            "Callback called before each validation check. See the [mwc-textfield's validation section](https://github.com/material-components/material-components-web-components/tree/master/packages/textfield#validation) for more details.",
        ),
        Property(
          name = "validateOnInitialRender",
          tpe = WebComponentFieldType.Boolean,
          description = "Runs validation check on initial render.",
        ),
      ),
      methods = Seq(
        Method(
          name = "checkValidity",
          description =
            "Returns `true` if the select passes validity checks. Returns `false` and fires an [`invalid`](https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement/invalid_event) event on the select otherwise. <br>**NOTE:** When accessing any property or function that checks validity at select initial boot up, you may have to await `<mwc-select>.updateComplete`.",
        ),
        Method(
          name = "reportValidity",
          description =
            "Runs `checkValidity()` method, and if it returns false, then it reports to the user that the input is invalid.",
        ),
        Method(
          name = "setCustomValidity",
          description =
            "Sets a custom validity message (also overwrites `validationMessage`). If this message is not the empty string, then the element is suffering from a custom validity error and does not validate.",
        ),
        Method(name = "select", description = "Selects the element at the given index."),
        Method(
          name = "layout",
          description =
            "Resets tabindex on all items and will update `items` model if provided true. It may be required to call layout if selectability of an element is dynamically changed. e.g. `[mwc-list-item]` attribute is removed from a list item or `noninteractive` is dynamically set on a list item. Also re-calculates layout. If a select is styled with `display:none` before it is first rendered, and it has a label that is floating, then you must call `layout()` the first time you remove `display:none`, or else the notch surrounding the label will not render correctly.",
        ),
      ),
      events = Seq(
        Event(name = "opened", description = "Fired menu opens."),
        Event(name = "closed", description = "Fired menu closes."),
        Event(name = "action", description = "Fired when a selection has been made via click or keyboard action."),
        Event(
          name = "selected",
          description =
            "Fired when a selection has been made. Property `index` is the selected index (will  be of type `number`)",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(name = "--mdc-select-error-color", description = "Applies where --mdc-theme-error applies."),
        CSSProperty(
          name = "--mdc-select-idle-line-color",
          description = "Color of the filled select's bottom line when idle.",
        ),
        CSSProperty(
          name = "--mdc-select-hover-line-color",
          description = "Color of the filled select's bottom line when hovering.",
        ),
        CSSProperty(
          name = "--mdc-select-outlined-idle-border-color",
          description = "Color of the outlined select's outline when idle.",
        ),
        CSSProperty(
          name = "--mdc-select-outlined-hover-border-color",
          description = "Color of the outlined select's outline when hovering.",
        ),
        CSSProperty(
          name = "--mdc-select-outlined-disabled-border-color",
          description = "Color of the outlined select's outline when disabled.",
        ),
        CSSProperty(
          name = "--mdc-select-fill-color",
          description = "Color of the select's background fill (non-outlined).",
        ),
        CSSProperty(
          name = "--mdc-select-disabled-fill-color",
          description = "Color of the select's background fill (non-outlined) when disabled.",
        ),
        CSSProperty(
          name = "--mdc-select-ink-color",
          description = "Color of the selected text in default and error states.",
        ),
        CSSProperty(
          name = "--mdc-select-label-ink-color",
          description = "Color of the non-focused floating label, helper text, and placeholder.",
        ),
        CSSProperty(
          name = "--mdc-select-focused-label-color",
          description = "Color of the focused floating label, helper text, and placeholder.",
        ),
        CSSProperty(
          name = "--mdc-select-disabled-ink-color",
          description =
            "Color of the input text, the floating label, helper text, and placeholder of a disabled select.",
        ),
        CSSProperty(
          name = "--mdc-select-dropdown-icon-color",
          description = "Color of the dropdown icon when select is not activated.",
        ),
        CSSProperty(
          name = "--mdc-select-focused-dropdown-icon-color",
          description = "Color of the dropdown icon when select is activated.",
        ),
        CSSProperty(
          name = "--mdc-select-disabled-dropdown-icon-color ",
          description = "Opacity of the dropdown icon when disabled.",
        ),
        CSSProperty(
          name = "--mdc-select-error-dropdown-icon-color",
          description = "Color of the dropdown icon when select is invalid.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-top-app-bar-fixed",
      description =
        "Fixed Top App Bars are a container for items such as application title, navigation icon, and action items that are always visible.",
      link =
        "https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar-fixed",
      npmPackage = NpmPackage(name = "@material/mwc-top-app-bar-fixed", version = "0.18.0"),
      slots = Slots(
        default = Some(
          DefaultSlot(description = "Scrollable content to display under the bar. This may be the entire application."),
        ),
        named = Seq(
          NamedSlot(
            name = "actionItems",
            description = "A number of <mwc-icon-button> elements to use for action icons on the right side.",
          ),
          NamedSlot(
            name = "navigationIcon",
            description = "One <mwc-icon-button> element to use for the left icon.",
          ),
          NamedSlot(
            name = "title",
            description = "A <div> or <span> that will be used as the title text.",
          ),
        ),
      ),
      properties = Seq(
        Property(
          name = "centerTitle",
          tpe = WebComponentFieldType.Boolean,
          description = "Centers the title horizontally. Only meant to be used with 0 or 1 `actionItems`.",
        ),
        Property(
          name = "dense",
          tpe = WebComponentFieldType.Boolean,
          description = "Makes the bar a little smaller for higher density applications.",
        ),
        Property(
          name = "prominent",
          tpe = WebComponentFieldType.Boolean,
          description = "Makes the bar much taller, can be combined with `dense`.",
        ),
        Property(
          name = "scrollTarget",
          tpe = WebComponentFieldType.Any,
          description = "Element used to listen for `scroll` events.",
        ),
      ),
      events = Seq(
        Event(
          name = "MDCTopAppBar:nav",
          description = "Fired when the navigationIcon is clicked.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-top-app-bar-fixed-box-shadow",
          description = "Sets the box shadow of the fixed top app bar when scrolling.",
        ),
        CSSProperty(
          name = "--mdc-top-app-bar-width",
          description = "Width of the `top-app-bar` in relation to the Window.",
        ),
      ),
    ),
    WebComponent(
      tag = "mwc-top-app-bar",
      description =
        "Top App Bars are a container for items such as application title, navigation icon, and action items.",
      link =
        "https://github.com/material-components/material-components-web-components/tree/master/packages/top-app-bar",
      npmPackage = NpmPackage(name = "@material/mwc-top-app-bar", version = "0.18.0"),
      slots = Slots(
        default = Some(
          DefaultSlot(description = "Scrollable content to display under the bar. This may be the entire application."),
        ),
        named = Seq(
          NamedSlot(
            name = "actionItems",
            description = "A number of <mwc-icon-button> elements to use for action icons on the right side.",
          ),
          NamedSlot(
            name = "navigationIcon",
            description = "One <mwc-icon-button> element to use for the left icon.",
          ),
          NamedSlot(
            name = "title",
            description = "A <div> or <span> that will be used as the title text.",
          ),
        ),
      ),
      properties = Seq(
        Property(
          name = "centerTitle",
          tpe = WebComponentFieldType.Boolean,
          description = "Centers the title horizontally. Only meant to be used with 0 or 1 `actionItems`.",
        ),
        Property(
          name = "dense",
          tpe = WebComponentFieldType.Boolean,
          description = "Makes the bar a little smaller for higher density applications.",
        ),
        Property(
          name = "prominent",
          tpe = WebComponentFieldType.Boolean,
          description = "Makes the bar much taller, can be combined with `dense`.",
        ),
        Property(
          name = "scrollTarget",
          tpe = WebComponentFieldType.Any,
          description = "Element used to listen for `scroll` events.",
        ),
      ),
      events = Seq(
        Event(
          name = "MDCTopAppBar:nav",
          description = "Fired when the navigationIcon is clicked.",
        ),
      ),
      cssProperties = Seq(
        CSSProperty(
          name = "--mdc-top-app-bar-width",
          description = "Width of the `top-app-bar` in relation to the Window.",
        ),
      ),
    ),
  ),
)
