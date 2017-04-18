/* C++ code produced by gperf version 3.0.3 */
/* Command-line: /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/gperf -L C++ -E -t /private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/appinfo-generated/KrollGeneratedBindings.gperf  */
/* Computed positions: -k'' */

#line 3 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/appinfo-generated/KrollGeneratedBindings.gperf"


#include <string.h>
#include <v8.h>
#include <KrollBindings.h>

#include "ti.appinfo.AppinfoModule.h"
#include "ti.appinfo.ApplicationInfoModule.h"


#line 14 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/appinfo-generated/KrollGeneratedBindings.gperf"
struct titanium::bindings::BindEntry;
/* maximum key range = 9, duplicates = 0 */

class AppinfoBindings
{
private:
  static inline unsigned int hash (const char *str, unsigned int len);
public:
  static struct titanium::bindings::BindEntry *lookupGeneratedInit (const char *str, unsigned int len);
};

inline /*ARGSUSED*/
unsigned int
AppinfoBindings::hash (register const char *str, register unsigned int len)
{
  return len;
}

struct titanium::bindings::BindEntry *
AppinfoBindings::lookupGeneratedInit (register const char *str, register unsigned int len)
{
  enum
    {
      TOTAL_KEYWORDS = 2,
      MIN_WORD_LENGTH = 24,
      MAX_WORD_LENGTH = 32,
      MIN_HASH_VALUE = 24,
      MAX_HASH_VALUE = 32
    };

  static struct titanium::bindings::BindEntry wordlist[] =
    {
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""},
#line 16 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/appinfo-generated/KrollGeneratedBindings.gperf"
      {"ti.appinfo.AppinfoModule", ::ti::appinfo::AppinfoModule::bindProxy, ::ti::appinfo::AppinfoModule::dispose},
      {""}, {""}, {""}, {""}, {""}, {""}, {""},
#line 17 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/appinfo-generated/KrollGeneratedBindings.gperf"
      {"ti.appinfo.ApplicationInfoModule", ::ti::appinfo::appinfo::ApplicationInfoModule::bindProxy, ::ti::appinfo::appinfo::ApplicationInfoModule::dispose}
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      unsigned int key = hash (str, len);

      if (key <= MAX_HASH_VALUE)
        {
          register const char *s = wordlist[key].name;

          if (*str == *s && !strcmp (str + 1, s + 1))
            return &wordlist[key];
        }
    }
  return 0;
}
#line 18 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/appinfo-generated/KrollGeneratedBindings.gperf"

